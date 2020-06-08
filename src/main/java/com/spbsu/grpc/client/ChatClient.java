package com.spbsu.grpc.client;

import com.spbsu.grpc.ChatApplication;
import com.spbsu.grpc.chat.Chat;
import com.spbsu.grpc.chat.ChatServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.application.Platform;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * Chat Client Application class
 */
@Slf4j
public class ChatClient {

    private String username;
    private String host;
    private String port;

    private boolean isStarted;
    private boolean isStopped;

    private ManagedChannel channel;
    private ChatServiceGrpc.ChatServiceStub chatService;
    private StreamObserver<Chat.ChatMessage> chat;


    public ChatClient(String username, String host, String port) {
        this.username = username;
        this.host = host;
        this.port = port;

        this.isStarted = false;
        this.isStopped = false;
    }

    public void start() {
        log.info("Open Client \"{}\" chat at {}:{}", username, host, port);
        channel = ManagedChannelBuilder.forAddress(host, Integer.parseInt(port)).usePlaintext(true).build();
        chatService = ChatServiceGrpc.newStub(channel);
        chat = chatService.chat(new StreamObserver<Chat.ChatMessageFromServer>() {
            @Override
            public void onNext(Chat.ChatMessageFromServer value) {
                log.info("Get Message: {} from {}", value.getMessage().getMessage(), value.getMessage().getFrom());
                Platform.runLater(() -> {
                    ChatApplication.addMessage(value.getMessage().getFrom(), value.getMessage().getMessage());
                });
            }

            @Override
            public void onError(Throwable t) {
                log.error("Lost | Unavailable connection");
                ChatApplication.addMessage(host + ":" + port, "Lost | Unavailable connection");
            }

            @Override
            public void onCompleted() {
                log.info("Disconnected");
                chat = null;
                stop();
            }
        });
        isStarted = true;
        isStopped = false;
    }

    public void stop() {
        if (chat != null) {
            chat.onCompleted();
        }
        chat = null;

        if (channel != null) {
            channel.shutdown();
        }
        channel = null;

        isStarted = false;
        isStopped = true;
    }

    public void sendMessage(String message) {
        Chat.ChatMessage chatMessage = Chat.ChatMessage.newBuilder()
                .setFrom(username)
                .setHost(host)
                .setPort(port)
                .setMessage(message)
                .build();

        chat.onNext(chatMessage);
        log.info("Send \"{}\" to Chat {}:{}", chatMessage.getMessage(), chatMessage.getHost(), chatMessage.getPort());
    }

    public void sendMessage(Chat.ChatMessage chatMessage) {
        chat.onNext(chatMessage);
    }

    public boolean ready() {
        return isStarted && !isStopped;
    }

    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient("name", "localhost", "9090");
        chatClient.start();
    }
}

