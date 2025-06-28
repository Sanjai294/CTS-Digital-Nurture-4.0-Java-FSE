package exercise7;

import org.junit.jupiter.api.Test;

public class LoggerServiceTest {

    @Test
    public void testLoggingOutput() {
        LoggerService service = new LoggerService();
        service.doSomething(); // Logs info, warning, and error
    }
}