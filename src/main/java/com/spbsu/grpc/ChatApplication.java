package com.spbsu.grpc;


import com.spbsu.grpc.client.ChatClient;
import com.spbsu.grpc.server.ChatServer;
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

/**
 * Main Application class
 */
@Slf4j
public class ChatApplication extends Application {
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
    private TextField messageTextField = new TextField();
    private Button sendButton = new Button();
    private Button closeButton = new Button();
    private Scene chatScene;

    private static ObservableList<String> messages;
    private static ListView<String> messagesView;

    private ChatServer server;
    private Thread serverThread;

    private ChatClient client;

    @Override
    public void start(Stage primaryStage) {
        messages = FXCollections.observableArrayList();
        messagesView = new ListView<>();

        serverButton.setOnAction(event -> {
            messages.clear();
            messagesView.getItems().clear();
            sendButton.setDisable(false);

            this.username = usernameTextField.getText();
            this.host = hostTextField.getText();
            this.port = portTextField.getText();

            server = new ChatServer(port);
            serverThread = new Thread(() -> {
                Thread.currentThread().setName("Server " + "localhost" + ":" + port);
                server.start();
            });
            serverThread.start();

            client = new ChatClient(username, host, port);
            client.start();

            primaryStage.setScene(chatScene);
        });

        clientButton.setOnAction(event -> {
            messages.clear();
            messagesView.getItems().clear();
            sendButton.setDisable(false);

            this.username = usernameTextField.getText();
            this.host = hostTextField.getText();
            this.port = portTextField.getText();

            client = new ChatClient(username, host, port);
            client.start();

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

        startScene = new Scene(startVBox, 240, 260);

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

        chatScene = new Scene(root, 480, 520);

        primaryStage.setScene(startScene);
        primaryStage.show();


        sendButton.setOnAction(e -> {
            client.sendMessage(messageTextField.getText());
            messageTextField.setText("");
        });

        closeButton.setOnAction(e -> {
            log.info("CloseButton pushed");

            if (client != null) {
                client.stop();
            }
            client = null;

            if (server != null) {
                server.stop();
                serverThread.stop();
            }
            server = null;

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

    public static void addMessage(String from, String message) {
        Platform.runLater(() -> {
            messages.add(from + ": " + message);
            messagesView.scrollTo(messages.size());
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}