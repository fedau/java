public class Printer {

    private int sheetsLeft;
    private int pages;
    private int copies;

    private int toner;

    public Printer(int pages, int copies){
        this.sheetsLeft = 30;
        this.pages = pages;
        this.copies = copies;
        this.toner = 20;
    }

    public int getTotalPages() {
        return this.sheetsLeft;
    }

    public int getCartridgeTotal() {
        return this.toner;
    }

    public String print() {
        int total = this.pages * this.copies;
        if (total <= this.sheetsLeft && total <= this.toner){
           this.sheetsLeft = this.sheetsLeft- total;
           this.toner = this.toner - total;
           return (String.format (" %s printed %s sheetsleft %s toner left", total, this.sheetsLeft, this.toner));
        }
        return "not enough paper";
    }
}
