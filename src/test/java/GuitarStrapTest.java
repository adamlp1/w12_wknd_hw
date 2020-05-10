import org.junit.Before;
import org.junit.Test;
import shop.GuitarStrap;

import static org.junit.Assert.assertEquals;

public class GuitarStrapTest {

    GuitarStrap strap;

    @Before
    public void before() {
        strap = new GuitarStrap("Orange", 3, 6);
    }

    @Test
    public void hasAColour() {
        assertEquals("Orange", strap.getColour());
    }

    @Test
    public void hasABuyPrice() {
        assertEquals(3, strap.getBuyPrice());
    }

    @Test
    public void hasASellPrice() {
        assertEquals(6, strap.getSellPrice());
    }

    @Test
    public void canCalculatePrice() {
        assertEquals(3, strap.calculateMarkup());
    }
}
