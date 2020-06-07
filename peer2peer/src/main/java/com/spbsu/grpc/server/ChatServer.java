package com.spbsu.grpc.server;

import com.spbsu.grpc.service.ChatServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class ChatServer {

    private boolean isStarted;
    private boolean isStopped;

    private Server server;
    private String host;
    private String port;

    public ChatServer(String host, String port) {
        this.isStarted = false;
        this.isStopped = false;
        this.host = host;
        this.port = port;
    }

    public void start() {
        try {
            server = ServerBuilder
                    .forPort(Integer.parseInt(port))
                    .addService(new ChatServiceImpl())
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

    public static void main(String[] args) throws InterruptedException, IOException {
        ChatServer chatServer = new ChatServer("localhost", "9090");
        chatServer.start();
    }

}
