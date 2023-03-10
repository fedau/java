package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction  implements ISecurity , IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } {return false;}

//        return visitor.getAge() >= 12 && visitor.getHeight() >= 145
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200){
            return defaultPrice() * 2;
        }
        {
            return defaultPrice();
        }
    }
}
