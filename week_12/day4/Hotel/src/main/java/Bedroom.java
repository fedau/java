import java.util.Collection;

public class Bedroom extends Room {
    private int roomNumber;

    private RoomType roomType;

    private double nightlyRate;

    public Bedroom(int roomNumber, RoomType roomType, double nightlyRate) {
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
