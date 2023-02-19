package Item.instruments;

import shop.Sellable;

public abstract class InstrumentSuper implements Sellable {

    String type;
    String colour;
    String Material;

    double boughtPrice;

    double sellPrice;
    public InstrumentSuper(String type, String colour, String material, double boughtPrice, double sellPrice) {
        this.type = type;
        this.colour = colour;
        Material = material;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double markup() {
        return sellPrice - boughtPrice;
    }


}
