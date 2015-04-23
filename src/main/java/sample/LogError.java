package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogError {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogError.class);
        logger.error("error", new RuntimeException("message"));
        waitForExit();
    }

    public static void waitForExit() {
        try {
            System.out.println("Press enter to exit ...");
            System.in.read();
        } catch (java.io.IOException e) {}
    }
}
