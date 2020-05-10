import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import shop.GuitarStrap;
import shop.Harp;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    ISell item;

    @Before
    public void before() {
        shop = new Shop("Juan's Music Shop");
        item = new GuitarStrap("Blue", 3, 6);
    }

    @Test
    public void hasAName() {
        assertEquals("Juan's Music Shop", shop.getName());
    }

    @Test
    public void shopStartsEmpty() {
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canAddItem() {
        shop.addItem(item);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canAddInstrument() {
        item = new Harp("Roosebeck", "Gold", 40, 350, 480);
        shop.addItem(item);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canRemoveItem() {
        shop.addItem(item);
        shop.removeItem(item);
        assertEquals(0, shop.getStock());
    }
}
