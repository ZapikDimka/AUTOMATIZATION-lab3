package org.example;

import java.util.logging.Logger;

public class UtilClass {
    private static final Logger logger = Logger.getLogger(UtilClass.class.getName());

    public void printUtilMessage() {
        logger.info("Hello from Util!");
    }

    public void logInfo(String message) {
        logger.info(message);
    }

    public void logError(String message) {
        logger.severe(message);
    }
}
