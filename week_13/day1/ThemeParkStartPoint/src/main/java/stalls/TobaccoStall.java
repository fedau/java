package stalls ;

import behaviours.ISecurity;
import people.Visitor;


public class TobaccoStall extends Stall implements ISecurity{

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }


    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public int getRating() {
        return 0;
    }
}


