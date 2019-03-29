package InstrumentsTest;

import Instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("Percussion", "Casio", 1400.00, 2400.00, 76);
    }

    @Test
    public void hasType(){
        assertEquals("Percussion", keyboard.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Casio", keyboard.getBrand());
    }

    @Test
    public void hasTradePrice(){
        assertEquals(1400.00, keyboard.getTradePrice(), 0);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(2400.00, keyboard.getRetailPrice(), 0);
    }

    @Test
    public void hasKeys(){
        assertEquals(76, keyboard.getKeys());
    }

    @Test
    public void canMakeSound(){
        assertEquals("Keyboard sound: bing bing", keyboard.play("bing bing"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1000, keyboard.calculateMarkup(), 0);
    }
}
