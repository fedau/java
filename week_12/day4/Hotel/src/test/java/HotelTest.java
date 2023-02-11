import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Guest guest;
    private Bedroom room;

    @Before
    public void setup() {
        hotel = new Hotel();
        guest = new Guest("Ben");
        room = new Bedroom(1, RoomType.SINGLE, 99.99);
    }

    @Test
    public void canCheckInGuest() {
        // need to know which guest, need to know which room
        hotel.checkInGuest(guest, room);
        assertEquals(1, room.getGuests().size());
    }

    @Test
    public void canCheckOutGuest() {
        hotel.checkInGuest(guest, room);
        hotel.checkOutGuest(guest, room);
        assertEquals(0, room.getGuests().size());
    }

    @Test
    public void canAddBooking() {
        Booking booking = hotel.bookRoom(room, 5);
        assertEquals(5, booking.getNumberOfNights());
        assertEquals(room, booking.getBedroom());
    }
}
