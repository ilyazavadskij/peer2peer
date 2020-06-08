import com.spbsu.grpc.server.ChatServer;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class ServerTest {

    private String port = "7070";

    @Test
    public void checkServerStarted() {
        ChatServer chatServer = new ChatServer(port);
        new Thread(chatServer::start).start();

        long startTime = System.currentTimeMillis();
        long stopTime = System.currentTimeMillis();
        while (stopTime - startTime < 5000 && !chatServer.ready()) {
            stopTime = System.currentTimeMillis();
        }

        Assert.assertTrue(chatServer.ready());
        log.info("Successful Test: checkServerStarted");
        chatServer.stop();

        startTime = System.currentTimeMillis();
        stopTime = System.currentTimeMillis();
        while (stopTime - startTime < 5000) {
            stopTime = System.currentTimeMillis();
        }
    }

    @Test
    public void checkServerStartedStopped() {
        ChatServer chatServer = new ChatServer(port);

        new Thread(chatServer::start).start();
        long startTime = System.currentTimeMillis();
        long stopTime = System.currentTimeMillis();
        while (stopTime - startTime < 5000 && !chatServer.ready()) {
            stopTime = System.currentTimeMillis();
        }
        Assert.assertTrue(chatServer.ready());

        chatServer.stop();
        startTime = System.currentTimeMillis();
        stopTime = System.currentTimeMillis();
        while (stopTime - startTime < 5000) {
            stopTime = System.currentTimeMillis();
        }
        Assert.assertFalse(chatServer.ready());
        log.info("Successful Test: checkServerStartedStopped");
    }


}