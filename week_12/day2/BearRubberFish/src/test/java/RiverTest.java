import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {

    private River river;
    private Salmon salmon;

    @Before
    public void before(){
        river = new River();
        salmon = new Salmon();
    }

    @Test
    public void canAddSalmon(){
        river.addFish(salmon);
        assertEquals(1, river.fishCount());
    }

    @Test
    public void fishGetsRemoved(){
        river.addFish(salmon);
        river.removeFish();
        assertEquals(0, river.fishCount());
    }
}
