import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new HashMap<>();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public DiningRoom getDiningRoom(String diningRoomName) {
        return diningRooms.get(diningRoomName);
    }

    public void checkInGuest(Guest guest, Bedroom room) {
        room.addGuest(guest);
    }

    public void checkOutGuest(Guest guest, Bedroom room) {
        room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom room, int numberOfNights) {
        return new Booking(room, numberOfNights);
    }
}
