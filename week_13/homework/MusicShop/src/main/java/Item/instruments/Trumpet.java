package Item.instruments;

import Item.Items;

public class Trumpet extends Items implements Playable{

    Type type;
    String colour;

    String material;
    int numOfValves;
    public Trumpet(Type type, String colour, String material, double boughtPrice, double sellPrice, int numOfValves) {
        super(boughtPrice, sellPrice);
        this.numOfValves = numOfValves;
        this.type = type;
        this.material = material;
        this.colour = colour;
    }

    @Override
    public String play() {
        return "TuutTuut";
    }

}
