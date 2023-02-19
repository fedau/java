import Item.instruments.Guitar;
import Item.instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Type type;
    Guitar guitar;
    @Before
    public void before(){
        guitar = new Guitar(type.STRING, "yellow", "mahoganhy", 160, 199.99, 6);
    }

    @Test
    public void markup(){
        assertEquals(39.99, guitar.markup(), 0.1);
    }


    @Test
    public void play(){
        assertEquals("Tjing, Tjing", guitar.play());
    }

}
