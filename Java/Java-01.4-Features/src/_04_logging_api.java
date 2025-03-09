/**
 * Note: Java 1.4 introduced a new logging API that offers a flexible logging framework for applications.
 */

import java.util.logging.Logger;
import java.util.logging.Level;

public class _04_logging_api {
    private static final Logger logger = Logger.getLogger(_04_logging_api.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        logger.info("This is an info message.");
        logger.warning("This is a warning message.");
        logger.severe("This is a severe message.");
    }
}
