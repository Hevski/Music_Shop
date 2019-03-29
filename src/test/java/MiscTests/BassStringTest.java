package MiscTests;

import Misc.BassString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassStringTest {

    BassString bassString;

    @Before
    public void before(){
        bassString = new BassString("Some Strings", 10.50, 15.00, 5);
    }

    @Test
    public void hasBrand(){
        assertEquals("Some Strings", bassString.getBrand());
    }

    @Test
    public void hasTradePrice(){
        assertEquals(10.50, bassString.getTradePrice(),0);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(15.00, bassString.getRetailPrice(),0);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(5, bassString.getStrings());
    }

}
