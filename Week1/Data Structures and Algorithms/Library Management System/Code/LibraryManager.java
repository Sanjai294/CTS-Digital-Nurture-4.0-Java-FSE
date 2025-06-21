import java.util.*;

public class LibraryManager {
    private Map<String, Book> books;
    private Map<String, User> users;
    private Map<String, String> issuedBooks;

    public LibraryManager() {
        books = new HashMap<>();
        users = new HashMap<>();
        issuedBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void removeBook(String bookId) {
        books.remove(bookId);
        issuedBooks.remove(bookId);
    }

    public void registerUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void issueBook(String bookId, String userId) {
        Book book = books.get(bookId);
        if (book != null && !book.isIssued() && users.containsKey(userId)) {
            book.setIssued(true);
            issuedBooks.put(bookId, userId);
        }
    }

    public void returnBook(String bookId) {
        Book book = books.get(bookId);
        if (book != null && book.isIssued()) {
            book.setIssued(false);
            issuedBooks.remove(bookId);
        }
    }

    public List<Book> getAllBooksSortedByTitle() {
        List<Book> list = new ArrayList<>(books.values());
        list.sort(Comparator.comparing(Book::getTitle));
        return list;
    }

    public List<Book> getAllBooksSortedByAuthor() {
        List<Book> list = new ArrayList<>(books.values());
        list.sort(Comparator.comparing(Book::getAuthor));
        return list;
    }

    public Book searchBookById(String bookId) {
        return books.get(bookId);
    }

    public List<Book> getIssuedBooks() {
        List<Book> result = new ArrayList<>();
        for (String bookId : issuedBooks.keySet()) {
            result.add(books.get(bookId));
        }
        return result;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }
}
