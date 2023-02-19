package Item.instruments;

import Item.Items;

public class Guitar extends Items implements Playable{

    Type type;
    String colour;

    String material;
    int numOfStrings;
    public Guitar(Type type, String colour, String material, double boughtPrice, double sellPrice, int numOfStrings) {
        super( boughtPrice, sellPrice);
        this.numOfStrings = numOfStrings;
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    @Override
    public String play() {
        return "Tjing, Tjing";
    }
}
