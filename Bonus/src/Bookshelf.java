import java.util.ArrayList;
import java.util.Collections;

public class Bookshelf {
    private ArrayList<Book> books;

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.add("Ready Player One", "NotErnest Cline");
        bookshelf.add("Ready Player One", "Ernest Cline");
        bookshelf.add("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");

        System.out.println(bookshelf);

        bookshelf.sort();
        System.out.println("Sorting bookshelf!");

        System.out.println(bookshelf);
        System.out.println("=-=-=-=-=");

        String search1 = bookshelf.getBook("Harry Potter and the Sorcerer's Stone");
        System.out.println(search1);
    }

    public Bookshelf() {
        books = new ArrayList<Book>(10);
    }

    public Bookshelf(int length) {
        books = new ArrayList<Book>(length);
    }

    public void add(String title, String authorName) {
        Book newBook = new Book(title, authorName);
        books.add(newBook);
    }

    public void sort() {
        Collections.sort(books);
    }

    public String getBook(String name) {
        for (Book book : books) {
            if (book.getTitle().equals(name))
                return book.getTitle();
        }

        return "Book title not found!";
    }

    @Override
    public String toString() {
        return "Bookshelf has: " + books;
    }
}
