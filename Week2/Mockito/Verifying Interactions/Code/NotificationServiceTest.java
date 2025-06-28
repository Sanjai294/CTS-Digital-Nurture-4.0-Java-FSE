package exercise6;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    public void testSendIsCalled() {
        // Arrange
        Notifier mockNotifier = mock(Notifier.class);
        NotificationService service = new NotificationService(mockNotifier);

        // Act
        service.alert("Hello!");

        // Assert / Verify
        verify(mockNotifier).send("Hello!");
    }
}
