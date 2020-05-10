import org.junit.Before;
import org.junit.Test;
import shop.Plectrum;

import static org.junit.Assert.assertEquals;

public class PlectrumTest {

    Plectrum pick;

    @Before
    public void before() {
        pick = new Plectrum("Blue", 1, 2);
    }

    @Test
    public void hasAColour() {
        assertEquals("Blue", pick.getColour());
    }

    @Test
    public void hasABuyPrice() {
        assertEquals(1, pick.getBuyPrice());
    }

    @Test
    public void hasASellPrice() {
        assertEquals(2, pick.getSellPrice());
    }

    @Test
    public void canCalculatePrice() {
        assertEquals(1, pick.calculateMarkup());
    }
}
