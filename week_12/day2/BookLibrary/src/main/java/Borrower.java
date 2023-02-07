import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> book;

    public Borrower() {
        this.book = new ArrayList<>();
    }

    public int bookCount() {
        return book.size();
    }

    public void rentBook(Library library) {
        Book book = library.removeBook();
        this.book.add(book);
    }

//
//    public void rentBooktoBorrower(Borrower borrower) {
//        Book book = borrower.rentBook(Book);
//        return this.book.remove(book1);
//
//    }
}
