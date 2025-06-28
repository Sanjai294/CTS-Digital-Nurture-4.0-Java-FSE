package exercise5;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBookTitle(String bookId) {
        Book book = bookRepository.findBookById(bookId);
        return book != null ? book.getTitle() : null;
    }
}

