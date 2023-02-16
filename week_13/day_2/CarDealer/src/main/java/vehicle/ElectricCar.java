package vehicle;

import vehicle.parts.Engine;
import vehicle.parts.GearBox;
import vehicle.parts.Tyres;

public class ElectricCar extends Vehicle{
    String batterySize;

    public ElectricCar(Engine engine, GearBox gearbox, Tyres tyres, String colour, double price, String batterySize) {
        super(engine, gearbox, tyres, colour, price);
        this.batterySize = batterySize;
    }

    public String getBatterySize() {
        return batterySize;
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
