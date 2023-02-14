package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall {

    public CandyflossStall(String name, String ownerName, int rating ,ParkingSpot parkingSpot) {
        super(name, ownerName, rating ,parkingSpot);
    }


    @Override
    public int getRating() {
        return 0;
    }
}
