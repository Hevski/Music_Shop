package ShopTests;

import Instruments.BassGuitar;
import Misc.BassString;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    BassGuitar bassGuitar;
    BassString bassString;
    Shop shop;

    @Before
    public void before(){
        bassGuitar = new BassGuitar("String", "Warwick", 1999.00, 2999.00, 5);
        bassString = new BassString("Some Strings", 10.50, 15.00, 5);
        shop = new Shop("Music Music");
    }

    @Test
    public void hasName() {
        assertEquals("Music Music", shop.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStock() {
        shop.addStock(bassGuitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(bassString);
        shop.addStock(bassGuitar);
        shop.sellStock(bassGuitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void calculateTotalProfit(){
        shop.addStock(bassString);
        shop.addStock(bassGuitar);
        assertEquals(1004.0, shop.calculateProfit(),0);
    }
}
