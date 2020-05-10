import org.junit.Before;
import org.junit.Test;
import shop.Harp;

import static org.junit.Assert.assertEquals;

public class HarpTest {

    Harp harp;

    @Before
    public void before() {
        harp = new Harp("Roosebeck", "Gold", 40, 350, 480);
    }

    @Test
    public void hasAMake() {
        assertEquals("Roosebeck", harp.getMake());
    }

    @Test
    public void hasAColour() {
        assertEquals("Gold", harp.getColour());
    }

    @Test
    public void hasAStringCount() {
        assertEquals(40, harp.getStringCount());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(350, harp.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(480, harp.getSellPrice());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Bllling", harp.play());
    }

    @Test
    public void canCalculatePrice() {
        assertEquals(130, harp.calculateMarkup());
    }
}
