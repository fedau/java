package Item;

public class DrumSticks extends Items {
    String name;
    public DrumSticks(double boughtPrice, double sellPrice, String name) {
        super(boughtPrice, sellPrice);
        this.name = name;
    }
}
