package com.spbsu.grpc.client;

import com.spbsu.grpc.chat.Chat;
import com.spbsu.grpc.chat.ChatServiceGrpc;
import com.spbsu.grpc.server.ChatServer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChatClient extends Application {

    private Label usernameLabel = new Label("Username: ");
    private TextField usernameTextField = new TextField("name");
    private Label hostLabel = new Label("Host: ");
    private TextField hostTextField = new TextField("localhost");
    private Label portLabel = new Label("Port: ");
    private TextField portTextField = new TextField("9090");
    private Button serverButton = new Button("Server");
    private Button clientButton = new Button("Client");
    private Scene startScene;

    private String username;
    private String host;
    private String port;

    private ObservableList<String> messages = FXCollections.observableArrayList();
    private ListView<String> messagesView = new ListView<>();
    private TextField messageTextField = new TextField();
    private Button sendButton = new Button();
    private Button closeButton = new Button();
    private Scene chatScene;

    private ChatServer server;
    private ManagedChannel channel;
    private ChatServiceGrpc.ChatServiceStub chatService;
    private StreamObserver<Chat.ChatMessage> chat;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        serverButton.setOnAction(event -> {
            messages.clear();
            messagesView.getItems().clear();
            sendButton.setDisable(false);

            log.info("Open Client \"{}\" chat at {}:{}", usernameTextField.getText(), hostTextField.getText(), portTextField.getText());
            this.username = usernameTextField.getText();
            this.host = hostTextField.getText();
            this.port = portTextField.getText();

            server = new ChatServer(host, port);
            new Thread(() -> {
                Thread.currentThread().setName("Server " + host + ":" + port);
                server.start();
            }).start();

            channel = ManagedChannelBuilder.forAddress(host, Integer.parseInt(port)).usePlaintext(true).build();
            chatService = ChatServiceGrpc.newStub(channel);
            chat = chatService.chat(new StreamObserver<Chat.ChatMessageFromServer>() {
                @Override
                public void onNext(Chat.ChatMessageFromServer value) {
                    Platform.runLater(() -> {
                        messages.add(value.getMessage().getFrom() + ": " + value.getMessage().getMessage());
                        messagesView.scrollTo(messages.size());
                    });
                }

                @Override
                public void onError(Throwable t) {
                    try {
                        log.error("Lost | Unavailable connection");
                        messages.add(host + ":" + port + ": Lost | Unavailable connection");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        log.error(e.getLocalizedMessage(), e);
                    }
                    chat = null;
                    chatService = null;
                    channel = null;
                }

                @Override
                public void onCompleted() {
                    log.info("Disconnected");
                    chat = null;
                    chatService = null;
                    channel = null;
                }
            });

            primaryStage.setScene(chatScene);
        });

        clientButton.setOnAction(event -> {
            messages.clear();
            messagesView.getItems().clear();
            sendButton.setDisable(false);

            log.info("Open Client \"{}\" chat at {}:{}", usernameTextField.getText(), hostTextField.getText(), portTextField.getText());
            this.username = usernameTextField.getText();
            this.host = hostTextField.getText();
            this.port = portTextField.getText();

            channel = ManagedChannelBuilder.forAddress(host, Integer.parseInt(port)).usePlaintext(true).build();
            chatService = ChatServiceGrpc.newStub(channel);
            chat = chatService.chat(new StreamObserver<Chat.ChatMessageFromServer>() {
                @Override
                public void onNext(Chat.ChatMessageFromServer value) {
                    Platform.runLater(() -> {
                        messages.add(value.getMessage().getFrom() + ": " + value.getMessage().getMessage());
                        messagesView.scrollTo(messages.size());
                    });
                }

                @Override
                public void onError(Throwable t) {
                    log.error("Lost | Unavailable connection");
                    Platform.runLater(() -> {
                        messages.add(host + ":" + port + ": Lost | Unavailable connection");
                        messagesView.scrollTo(messages.size());
                        sendButton.setDisable(true);
                    });
                    chat = null;
                    chatService = null;
                    if (channel != null) {
                        channel.shutdown();
                        channel = null;
                    }
                }

                @Override
                public void onCompleted() {
                    log.info("Disconnected");
                    chat = null;
                    chatService = null;
                    channel.shutdown();
                    channel = null;
                }
            });

            primaryStage.setScene(chatScene);
        });

        HBox usernameHBox = new HBox();
        usernameHBox.setAlignment(Pos.CENTER_RIGHT);
        usernameHBox.setSpacing(10);
        usernameHBox.setPadding(new Insets(0, 10, 0, 10));
        usernameHBox.getChildren().addAll(usernameLabel, usernameTextField);

        HBox hostHBox = new HBox();
        hostHBox.setAlignment(Pos.CENTER_RIGHT);
        hostHBox.setSpacing(10);
        hostHBox.setPadding(new Insets(0, 10, 0, 10));
        hostHBox.getChildren().addAll(hostLabel, hostTextField);

        HBox portHBox = new HBox();
        portHBox.setAlignment(Pos.CENTER_RIGHT);
        portHBox.setSpacing(10);
        portHBox.setPadding(new Insets(0, 10, 0, 10));
        portHBox.getChildren().addAll(portLabel, portTextField);

        HBox buttonHBox = new HBox();
        buttonHBox.setAlignment(Pos.CENTER);
        buttonHBox.setSpacing(10);
        buttonHBox.setPadding(new Insets(0, 10, 0, 10));
        buttonHBox.getChildren().addAll(clientButton, serverButton);

        VBox startVBox = new VBox();
        startVBox.setAlignment(Pos.CENTER);
        startVBox.setSpacing(10);
        startVBox.getChildren().addAll(usernameHBox, hostHBox, portHBox, buttonHBox);

        startScene = new Scene(startVBox, 240, 240);

        messagesView.setItems(messages);

        sendButton.setText("Send");
        closeButton.setText("Close");
        closeButton.setPrefWidth(480);

        BorderPane pane = new BorderPane();
        pane.setCenter(messageTextField);
        pane.setRight(sendButton);
        pane.setBottom(closeButton);

        BorderPane root = new BorderPane();
        root.setCenter(messagesView);
        root.setBottom(pane);

        chatScene = new Scene(root, 480, 480);

        primaryStage.setScene(startScene);
        primaryStage.show();


        sendButton.setOnAction(e -> {
            Chat.ChatMessage chatMessage = Chat.ChatMessage.newBuilder()
                    .setHost(host)
                    .setPort(port)
                    .setFrom(username)
                    .setMessage(messageTextField.getText())
                    .build();
            log.info("Send \"{}\" to Chat {}:{}", chatMessage.getMessage(), chatMessage.getHost(), chatMessage.getPort());
            chat.onNext(chatMessage);
            messageTextField.setText("");
        });

        closeButton.setOnAction(e -> {
            log.info("CloseButton pushed");
            if (chat != null) {
                chat.onCompleted();
                chat = null;
            }

            if (channel != null) {
                channel.shutdown();
                channel = null;
            }

            if (server != null && !server.isStopped) {
                server.stop();
                server = null;
            }

            messageTextField.setText("");
            messages.clear();
            messagesView.getItems().clear();
            primaryStage.setScene(startScene);
        });

        primaryStage.setOnCloseRequest(e -> {
            primaryStage.close();
            System.exit(1);
        });
    }
}

