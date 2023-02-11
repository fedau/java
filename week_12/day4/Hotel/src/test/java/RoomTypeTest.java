import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTypeTest {
    @Test
    public void singleRoomHasCapacityOf1() {
        assertEquals(1, RoomType.SINGLE.getCapacity());
    }
}
