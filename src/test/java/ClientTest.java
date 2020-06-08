import com.spbsu.grpc.chat.Chat;
import com.spbsu.grpc.client.ChatClient;
import com.spbsu.grpc.server.ChatServer;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class ClientTest {

    private String username = "name";
    private String host = "localhost";
    private String port = "8080";

    private ChatServer chatServer;

    @Test
    public void checkClientStarted() throws Exception {
        ChatClient chatClient = new ChatClient(username, host, port);
        chatClient.start();

        long startTime = System.currentTimeMillis();
        long stopTime = System.currentTimeMillis();
        while (stopTime - startTime < 5000 && !chatClient.ready()) {
            stopTime = System.currentTimeMillis();
        }

        Assert.assertTrue(chatClient.ready());
        log.info("Successful Test: checkClientStarted");
        chatClient.stop();
    }

    @Test
    public void checkClientStartedStopped() throws Exception {
        ChatClient chatClient = new ChatClient(username, host, port);

        chatClient.start();
        long startTime = System.currentTimeMillis();
        long stopTime = System.currentTimeMillis();
        while (stopTime - startTime < 5000 && !chatClient.ready()) {
            stopTime = System.currentTimeMillis();
        }
        Assert.assertTrue(chatClient.ready());

        chatClient.stop();
        startTime = System.currentTimeMillis();
        stopTime = System.currentTimeMillis();
        while (stopTime - startTime < 5000 && !chatClient.ready()) {
            stopTime = System.currentTimeMillis();
        }
        Assert.assertFalse(chatClient.ready());
        log.info("Successful Test: checkClientStartedStopped");
    }


    @Before
    public void startServer() {
        chatServer = new ChatServer(host, port);
        new Thread(chatServer::start).start();

        long startTime = System.currentTimeMillis();
        long stopTime = System.currentTimeMillis();
        while (stopTime - startTime < 5000 && !chatServer.ready()) {
            stopTime = System.currentTimeMillis();
        }
    }

    @Test
    public void sendMessage() throws Exception {
        ChatClient chatClient = new ChatClient(username, host, port);
        chatClient.start();

        String message = "Hello World";
        Chat.ChatMessage chatMessage = Chat.ChatMessage.newBuilder()
                .setFrom(username)
                .setHost(host)
                .setPort(port)
                .setMessage(message)
                .build();
        chatClient.sendMessage(chatMessage);

        long startTime = System.currentTimeMillis();
        long stopTime = System.currentTimeMillis();
        while (stopTime - startTime < 5000) {
            stopTime = System.currentTimeMillis();
        }

        int chatServerMessagesSize = chatServer.getMessages().size();
        Assert.assertEquals(chatServerMessagesSize, 1);
        log.info("ChatServerMessagesSize = {}", chatServerMessagesSize);

        Assert.assertEquals(chatServer.getMessages().get(0), chatMessage);

        chatClient.stop();
        log.info("Successful Test: sendMessage");
    }

    @After
    public void stopServer() {
        chatServer.stop();
    }
}