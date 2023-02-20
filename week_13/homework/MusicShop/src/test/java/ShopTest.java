import Item.SheetMusic;
import Item.instruments.Piano;
import Item.instruments.Trumpet;
import Item.instruments.Type;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Trumpet trumpet;
    Type type;

    SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop();
        trumpet = new Trumpet(type.HORN, "copper", "metal", 230.5, 299, 7 );
        piano = new Piano(type.KEY, "black", "wood", 470, 549, 2);
        sheetMusic = new SheetMusic(5, 10, "Mozart");
    }

    @Test
    public void TotalProfit(){
        shop.addsellable(trumpet);
        shop.addsellable(piano);
        shop.addsellable(sheetMusic);
        assertEquals(152.5, shop.Profit(), 0.01);
    }

    @Test
    public void stockSize(){
        shop.addItems(trumpet);
        shop.addItems(piano);
        assertEquals(2, shop.getStockItems().size());
    }
}
