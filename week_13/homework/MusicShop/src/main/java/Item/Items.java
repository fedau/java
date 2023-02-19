package Item;

import shop.Sellable;
public abstract class Items implements Sellable {
    double boughtPrice;
    double sellPrice;

    public Items(double boughtPrice, double sellPrice) {
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double markup() {
        return sellPrice - boughtPrice;
    }
}
