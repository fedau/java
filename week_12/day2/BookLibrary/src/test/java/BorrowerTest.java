import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Library library;
    private Book book;

    private Borrower borrower;

    private Book book1;
    private Book book2;
    private Book book3;
    @Before
    public void before() {
        library = new Library();
        borrower = new Borrower();
        library.addBook(book);
        book1 = new Book("mathilda", "Roahld", "Kid");
        book2 = new Book("Body", "Money", "Philosophy");
        book3 = new Book("Body", "Money", "Philosophy");

    }

    @Test
    public void bookCountStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void borrowerCanRentABook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
//        library.rentBook(book2);
        assertEquals(1, borrower.rentBook(book2));
    }

}
