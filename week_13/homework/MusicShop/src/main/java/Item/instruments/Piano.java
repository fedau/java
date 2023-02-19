package Item.instruments;

import Item.Items;

public class Piano extends Items implements Playable{
    Type type;
    String colour;

    String material;
    int numbOfPedals;

    public Piano(Type type, String colour, String material, double boughtPrice, double sellPrice, int numbOfPedals) {
        super(boughtPrice, sellPrice);
        this.numbOfPedals = numbOfPedals;
        this.type = type;
        this.colour = colour;
        this.material = material;
    }

    @Override
    public String play() {
        return "tututum tututum";
    }



    public int getNumbOfPedals() {
        return numbOfPedals;
    }

}
