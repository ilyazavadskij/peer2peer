package com.spbsu.grpc.server;

import com.spbsu.grpc.service.ChatServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class ChatServer {

    private String host;
    private String port;

    public ChatServer(String host, String port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws InterruptedException, IOException {
        Server server = ServerBuilder
                .forPort(Integer.parseInt(port))
                .addService(new ChatServiceImpl())
                .build();

        server.start();
        log.info("Chat Service started at {}:{}", host, port);

        server.awaitTermination();;
        log.info("Chat Service terminate at {}:{}", host, port);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        ChatServer chatServer = new ChatServer("localhost", "9090");
        chatServer.start();
    }

}
