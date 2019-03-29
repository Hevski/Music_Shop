package MiscTests;

import Misc.BassString;
import Misc.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Some Music", 7.50, 10.00, "Learn Tunes");
    }

    @Test
    public void hasBrand(){
        assertEquals("Some Music", sheetMusic.getBrand());
    }

    @Test
    public void hasTradePrice(){
        assertEquals(7.50, sheetMusic.getTradePrice(),0);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(10.00, sheetMusic.getRetailPrice(),0);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals("Learn Tunes", sheetMusic.getTitle());
    }
}
