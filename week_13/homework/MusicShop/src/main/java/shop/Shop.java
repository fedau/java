package shop;

import Item.Items;
import Item.instruments.InstrumentSuper;
import Item.instruments.Trumpet;

import java.util.ArrayList;

public class Shop {
    public ArrayList<Items> stockItems;

    public Shop(){
        this.stockItems = new ArrayList<Items>();
    }

    public ArrayList<Items> getStockItems() {
        return stockItems;
    }

    public void setStockItems(ArrayList<Items> stockItems) {
        this.stockItems = stockItems;
    }

    public double Profit(){
        double totalProfit = 0;

        for (Items item : this.stockItems) {
            totalProfit += item.markup();
        }

        return totalProfit;
    }

    public void addItems(Items item) {
        this.stockItems.add(item);
    }
}
