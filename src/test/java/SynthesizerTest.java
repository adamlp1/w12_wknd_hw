import org.junit.Before;
import org.junit.Test;
import shop.Synthesizer;

import static org.junit.Assert.assertEquals;

public class SynthesizerTest {

    Synthesizer synthesizer;

    @Before
    public void before() {
        synthesizer = new Synthesizer("Moog", "Purple", 37, 550, 750);
    }

    @Test
    public void hasAMake() {
        assertEquals("Moog", synthesizer.getMake());
    }

    @Test
    public void hasAColour() {
        assertEquals("Purple", synthesizer.getColour());
    }

    @Test
    public void hasKeyCount() {
        assertEquals(37, synthesizer.getKeyCount());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Womp", synthesizer.play());
    }

    @Test
    public void hasABuyPrice() {
        assertEquals(550, synthesizer.getBuyPrice());
    }

    @Test
    public void hasASellPrice() {
        assertEquals(750, synthesizer.getSellPrice());
    }

    @Test
    public void canCalculatePrice() {
        assertEquals(200, synthesizer.calculateMarkup());
    }


}
