package com.spbsu.grpc.service;

import com.google.protobuf.Timestamp;
import com.spbsu.grpc.chat.Chat;
import com.spbsu.grpc.chat.ChatServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class ChatServiceImpl extends ChatServiceGrpc.ChatServiceImplBase {

    private Set<StreamObserver<Chat.ChatMessageFromServer>> observers = ConcurrentHashMap.newKeySet();
    private Map<StreamObserver<Chat.ChatMessageFromServer>, String> observerToFrom = new ConcurrentHashMap<>();

    @Override
    public StreamObserver<Chat.ChatMessage> chat(StreamObserver<Chat.ChatMessageFromServer> responseObserver) {
        if (observers.size() == 2) {
            return null;
        }
        observers.add(responseObserver);
        log.info("Observers: {}", observers);

        return new StreamObserver<Chat.ChatMessage>() {
            @Override
            public void onNext(Chat.ChatMessage chatMessage) {
                String hostPort = chatMessage.getHost() + ":" + chatMessage.getPort();
                String from = chatMessage.getFrom();

                if (!observerToFrom.containsKey(responseObserver)) {
                    if (!observerToFrom.containsValue(from)) {
                        observerToFrom.put(responseObserver, from);
                    } else {
                        from += "TheSecond";
                        observerToFrom.put(responseObserver, from);
                    }
                } else {
                    from = observerToFrom.get(responseObserver);
                }

                log.info("Chat {} = {}:\"{}\" ", hostPort, from, chatMessage.getMessage());
                Chat.ChatMessageFromServer message = Chat.ChatMessageFromServer.newBuilder()
                        .setMessage(chatMessage)
                        .setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000))
                        .build();

                for (StreamObserver<Chat.ChatMessageFromServer> observer : observers) {
                    observer.onNext(message);
                }
            }

            @Override
            public void onError(Throwable t) {
                observers.remove(responseObserver);
                observerToFrom.remove(responseObserver);
                log.info("{} disconnected with Error", responseObserver);
            }

            @Override
            public void onCompleted() {
                observers.remove(responseObserver);
                observerToFrom.remove(responseObserver);
                log.info("{} disconnected", responseObserver);
            }
        };
    }
}
