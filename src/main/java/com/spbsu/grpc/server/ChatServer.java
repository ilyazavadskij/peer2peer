package com.spbsu.grpc.server;

import com.spbsu.grpc.chat.Chat;
import com.spbsu.grpc.service.ChatServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Chat Server class
 * that uses ChatServiceImpl
 */
@Slf4j
public class ChatServer {

    private Server server;
    private ChatServiceImpl chatService;
    private String host;
    private String port;

    private boolean isStarted;
    private boolean isStopped;

    public ChatServer(String port) {
        this.host = "localhost";
        this.port = port;

        this.isStarted = false;
        this.isStopped = false;
    }

    public ChatServer(String host, String port) {
        this.isStarted = false;
        this.isStopped = false;
        this.host = host;
        this.port = port;
    }

    public void start() {
        try {
            chatService = new ChatServiceImpl();

            server = ServerBuilder
                    .forPort(Integer.parseInt(port))
                    .addService(chatService)
                    .build();

            server.start();
            log.info("Chat Service started at {}:{}", host, port);
            isStarted = true;
            server.awaitTermination();

            log.info("Chat Service terminate at {}:{}", host, port);
        } catch (InterruptedException | IOException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    public void stop() {
        log.info("Chat Service shutdown at {}:{}", host, port);
        server.shutdownNow();
        this.isStopped = true;
        log.info("Chat Service stopped at {}:{}", host, port);
    }

    public boolean ready() {
        return isStarted && !isStopped;
    }

    public List<Chat.ChatMessage> getMessages() {
        return new LinkedList<>(chatService.getChatMessages());
    }

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer("localhost", "9090");
        chatServer.start();
    }

}
