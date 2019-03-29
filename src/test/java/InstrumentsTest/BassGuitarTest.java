package InstrumentsTest;

import Instruments.BassGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {

    BassGuitar bassGuitar;

    @Before
    public void before(){
        bassGuitar = new BassGuitar("String", "Warwick", 1999.00, 2999.00, 5);
    }

    @Test
    public void hasType(){
        assertEquals("String", bassGuitar.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Warwick", bassGuitar.getBrand());
    }

    @Test
    public void hasTradePrice(){
        assertEquals(1999.00, bassGuitar.getTradePrice(), 0);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(2999.00, bassGuitar.getRetailPrice(), 0);
    }

    @Test
    public void hasStrings(){
        assertEquals(5, bassGuitar.getStrings());
    }

    @Test
    public void canMakeSound(){
        assertEquals("Bass sound: wub wub", bassGuitar.play("wub wub"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1000, bassGuitar.calculateMarkup(), 0);
    }
}
