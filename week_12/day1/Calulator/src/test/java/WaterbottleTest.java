import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    private Waterbottle bottle;
    @Before
    public void setup(){
        bottle = new Waterbottle();
    }

    @Test
    public void waterBottleis100(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public  void waterbottldrink90(){
        assertEquals(90, bottle.drink());
    }

    @Test
    public void waterbottlecanbemeptied(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void waterbottlecanbefilled(){
        assertEquals(100, bottle.fill());
    }
}