import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final String ISBN;
    private final int id;


    Book(String bookTitle, String bookAuthor, String bookISBN, int bookId) {
        title = bookTitle;
        author = bookAuthor;
        ISBN = bookISBN;
        id = bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getID() {
        return id;
    }

    public String toString() {
        return String.format("%s: %s; ISBN %s (%d);", title, author, ISBN, id);
    }
}

