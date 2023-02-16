package vehicle;

import vehicle.parts.Engine;
import vehicle.parts.GearBox;
import vehicle.parts.Tyres;

public class HybridCar extends Vehicle {
    double kilomotersPerLiter;
    String batterySize;


    public HybridCar(Engine engine, GearBox gearbox, Tyres tyres, String colour, double price, double kilomotersPerLiter, String batterySize)

    {
        super(engine, gearbox, tyres, colour, price);
        this.kilomotersPerLiter = kilomotersPerLiter;
        this.batterySize = batterySize;

    }

    public double getKilomotersPerLiter() {
        return kilomotersPerLiter;
    }

    public void setKilomotersPerLiter(double kilomotersPerLiter) {
        this.kilomotersPerLiter = kilomotersPerLiter;
    }

    public String getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(String batterySize) {
        this.batterySize = batterySize;
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
