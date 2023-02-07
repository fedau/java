import java.util.ArrayList;

public class Library {

    private int maxstock = 3 ;
    private ArrayList<Book> book;


    public Library() {
        this.book = new ArrayList<>();
    }

    public String addBook(Book book) {
        if (this.book.size() < this.maxstock) {
            this.book.add(book);
            return "Book added";
        } else {
            return "Stock max";
        }
    }
    public int bookCount() {
        return this.book.size();
    }

    public void bookRemove(){
        return this.book.remove(0)
    }

//    public void rentBooktoBorrower(Borrower borrower) {
//        Book book = borrower.rentBook(Book);
//        return this.book.remove(book1);
//
//    }
}
