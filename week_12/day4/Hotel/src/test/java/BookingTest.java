import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    @Test
    public void canCalculateTotalBill() {
        Bedroom room = new Bedroom(1, RoomType.SINGLE, 99.99);
        Booking booking = new Booking(room, 5);
        double totalBill = booking.calculateTotal();

        assertEquals(499.95, totalBill, 0.0);
    }
}
