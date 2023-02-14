package stalls;

import behaviours.IReviewed;

public abstract class Stall implements IReviewed {

    private final int rating;
    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;

    public Stall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        this.name = name;
        this.rating = rating;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getRating() {
        return 0;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
