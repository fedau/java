package Item;

public class GuitarString extends Items {

    String name;
    public GuitarString(double boughtPrice, double sellPrice, String name) {
        super(boughtPrice, sellPrice);
        this.name = name;
    }
}
