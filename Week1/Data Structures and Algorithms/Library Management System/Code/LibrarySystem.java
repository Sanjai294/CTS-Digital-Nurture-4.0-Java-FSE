import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.addBook(new Book("B001", "Algorithms", "CLRS"));
        manager.addBook(new Book("B002", "Clean Code", "Robert C. Martin"));
        manager.addBook(new Book("B003", "Effective Java", "Joshua Bloch"));

        manager.registerUser(new User("U001", "Arun"));
        manager.registerUser(new User("U002", "Sita"));

        System.out.println("All Books:");
        printBooks(manager.getAllBooks());

        System.out.println("\nIssuing B001 to U001");
        manager.issueBook("B001", "U001");

        System.out.println("\nIssued Books:");
        printBooks(manager.getIssuedBooks());

        System.out.println("\nReturning Book B001");
        manager.returnBook("B001");

        System.out.println("\nBooks Sorted by Author:");
        printBooks(manager.getAllBooksSortedByAuthor());

        System.out.println("\nSearching for Book B002:");
        Book found = manager.searchBookById("B002");
        if (found != null) {
            System.out.println(found);
        }
    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
