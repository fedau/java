package Item;

public class SheetMusic extends Items{
    String name;
    public SheetMusic(double boughtPrice, double sellPrice, String name) {
        super(boughtPrice, sellPrice);
        this.name = name;
    }
}
