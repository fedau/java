import Item.instruments.Trumpet;
import Item.instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
Type type;
Trumpet trumpet;

@Before
    public void before(){
    trumpet = new Trumpet(type.HORN, "copper", "metal", 230.5, 299, 7 );
}

@Test
    public void markup(){
    assertEquals(68.5, trumpet.markup(), 0.1);
}

@Test
    public void play(){
    assertEquals("TuutTuut", trumpet.play());
}
}
