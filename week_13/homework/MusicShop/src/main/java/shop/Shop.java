package shop;

import Item.Items;
import Item.instruments.InstrumentSuper;
import Item.instruments.Trumpet;

import java.util.ArrayList;

public class Shop {
    public ArrayList<Items> stockItems;
    public ArrayList<Sellable> sellables;

    public Shop(){
        this.stockItems = new ArrayList<Items>();
        this.sellables = new ArrayList<Sellable>();
    }

    public ArrayList<Items> getStockItems() {
        return stockItems;
    }
    public ArrayList<Sellable> getSellableItems() {
        return sellables;
    }

    public void setStockItems(ArrayList<Items> stockItems) {
        this.stockItems = stockItems;
    }

    public double Profit(){
        double totalProfit = 0;

        for (Sellable sellables : this.sellables) {
            totalProfit += sellables.markup();
        }

        return totalProfit;
    }

    public void addItems(Items item) {
        this.stockItems.add(item);
    }

    public void addsellable(Sellable sellable) {
        this.sellables.add(sellable);
    }
}
