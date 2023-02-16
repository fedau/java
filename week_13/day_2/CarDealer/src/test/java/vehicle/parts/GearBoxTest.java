package vehicle.parts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {

    GearBox gearBox;

    @Before
    public void before(){
        gearBox = new GearBox(6);

    }

    @Test
    public void getNumberOfGears(){
        assertEquals(6, gearBox.getGears());
    }
}
