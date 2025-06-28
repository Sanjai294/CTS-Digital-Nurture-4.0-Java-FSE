package exercise5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Test
    public void testGetBookTitle() {
        // Arrange
        BookRepository mockRepo = mock(BookRepository.class);
        when(mockRepo.findBookById("101")).thenReturn(new Book("Mockito for Beginners"));

        BookService service = new BookService(mockRepo);

        // Act
        String title = service.getBookTitle("101");

        // Assert
        assertEquals("Mockito for Beginners", title);
        verify(mockRepo).findBookById("101");
    }
}
