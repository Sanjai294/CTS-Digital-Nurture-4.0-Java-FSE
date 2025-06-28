package exercise7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerService {
    private static final Logger logger = LoggerFactory.getLogger(LoggerService.class);

    public void doSomething() {
        logger.info("Info: Starting operation.");
        logger.warn("Warning: Something might be wrong.");
        logger.error("Error: Something went wrong.");
    }
}
