import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle();
    }

    @Test
    public void getVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void takeDrinkReducesVolumeBy10() {
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void emptyTheWaterBottle() {
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillTheWaterBottle() {
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }


}