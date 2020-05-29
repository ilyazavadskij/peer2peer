package com.spbsu.grpc.client;

import com.spbsu.grpc.chat.Chat;
import com.spbsu.grpc.chat.ChatServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

    private Scene scene;

    private Label usernameLabel = new Label("Username: ");
    private TextField usernameTextField = new TextField("name");
    private Label hostLabel = new Label("Host: ");
    private TextField hostTextField = new TextField("localhost");
    private Label portLabel = new Label("Port: ");
    private TextField portTextField = new TextField("9090");
    private Button connectButton = new Button("Connect");
    private Scene startScene;

    private String username;
    private String host;
    private String port;

    private ObservableList<String> messages = FXCollections.observableArrayList();
    private ListView<String> messagesView = new ListView<>();
    private TextField message = new TextField();
    private Button sendButton = new Button();
    private Button closeButton = new Button();
    private Scene chatScene;

    private ManagedChannel channel;
    private ChatServiceGrpc.ChatServiceStub chatService;
    private StreamObserver<Chat.ChatMessage> chat;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        connectButton.setOnAction(event -> {
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
                    log.info("OnError");
                }

                @Override
                public void onCompleted() {
                    log.info("Disconnected");
                }
            });

            if (chat == null) {
                log.info("Chat {}:{} is full", host, port);
            } else {
                primaryStage.setTitle("gRPC Chat");
                primaryStage.setScene(chatScene);
            }
        });

        HBox usernameHBox = new HBox();
        usernameHBox.setAlignment(Pos.CENTER_RIGHT);
        usernameHBox.getChildren().addAll(usernameLabel, usernameTextField);
        HBox hostHBox = new HBox();
        hostHBox.setAlignment(Pos.CENTER_RIGHT);
        hostHBox.getChildren().addAll(hostLabel, hostTextField);
        HBox portHBox = new HBox();
        portHBox.setAlignment(Pos.CENTER_RIGHT);
        portHBox.getChildren().addAll(portLabel, portTextField);

        VBox startVBox = new VBox();
        startVBox.setAlignment(Pos.CENTER);
        startVBox.getChildren().addAll(usernameHBox, hostHBox, portHBox, connectButton);
        startScene = new Scene(startVBox, 240, 240);


        messagesView.setItems(messages);

        sendButton.setText("Send");
        closeButton.setText("Close");
        closeButton.setPrefWidth(480);

        BorderPane pane = new BorderPane();
        pane.setCenter(message);
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
                    .setMessage(message.getText())
                    .build();
            log.info("Send \"{}\" to Chat {}:{}", chatMessage.getMessage(), chatMessage.getHost(), chatMessage.getPort());
            chat.onNext(chatMessage);
            message.setText("");
        });

        closeButton.setOnAction(e -> {
            chat.onCompleted();
            channel.shutdown();
            primaryStage.setScene(startScene);
        });

        primaryStage.setOnCloseRequest(e -> {
            chat.onCompleted();
            channel.shutdown();
            primaryStage.close();
        });
    }
}

