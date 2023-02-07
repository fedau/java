import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;


    @Before

    public void before(){
        library = new Library();
        borrower = new Borrower();
        borrower.rentBook(book2);
        book1 = new Book("mathilda", "Roahld", "Kid");
        book2 = new Book("Body", "Money", "Philosophy");
        book3 = new Book("Body", "Money", "Philosophy");
        book4 = new Book("Body", "Money", "Philosophy");
        book5 = new Book("Body", "Money", "Philosophy");

    }

    @Test
    public void howManyBooksInLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }
    @Test
    public void maxBooksinLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book4);
        assertEquals("Stock max", library.addBook(book3));
    }
    @Test
    public void rentBook(){
        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book4);
        library.rentBook(book1);
        library.rentBook(book2);
        assertEquals(1, library.bookCount());

    }

//    @Test
//    public void borrowersBooksGoUp(){
//        library.addBook(book2);
//        library.addBook(book1);
//        library.addBook(book4);
//        assertEquals(1, borrower.rentBook(book2));
//
//    }
}
