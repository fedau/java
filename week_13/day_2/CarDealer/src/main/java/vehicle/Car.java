package vehicle;

import vehicle.parts.Engine;
import vehicle.parts.GearBox;
import vehicle.parts.Tyres;

public class Car extends Vehicle{

    double kilomotersPerLiter;
    public Car(Engine engine, GearBox gearbox, Tyres tyres, String colour, double price, double kilomotersPerLiter) {
        super(engine, gearbox, tyres, colour, price);
        this.kilomotersPerLiter = kilomotersPerLiter;


    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor(Vehicle vehicle) {
        return 0;
    }
}
