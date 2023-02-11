import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void setup() {
        bedroom = new Bedroom(1, RoomType.DOUBLE, 99.99);
    }

    @Test
    public void bedroomHasACapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void bedroomHasARoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }
}
