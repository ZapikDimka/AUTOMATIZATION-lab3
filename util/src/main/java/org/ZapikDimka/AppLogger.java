package org.ZapikDimka;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class AppLogger {
    private final Logger logger;

    public AppLogger() {
        logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.INFO);
        consoleHandler.setLevel(Level.INFO);
    }

    public void logInfo(String message) {
        logger.info(message);
    }

    public void logError(String message) {
        logger.severe(message);
    }
}
