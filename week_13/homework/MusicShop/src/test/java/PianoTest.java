import Item.instruments.Piano;
import Item.instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;
    Type type;

    @Before
    public void before(){
        piano = new Piano(type.KEY, "black", "wood", 470, 549, 2);
    }

    @Test
    public void markupPrice(){
        assertEquals(79, piano.markup(), 0.1);
    }

    @Test
    public void playing(){
        assertEquals("tututum tututum", piano.play());
    }
}
