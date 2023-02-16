package vehicle;

import behaviours.IPurchase;
import vehicle.parts.Engine;
import vehicle.parts.GearBox;
import vehicle.parts.Tyres;

public abstract class Vehicle implements IPurchase {

    Engine engine;
    GearBox gearbox;
    Tyres tyres;

    String colour;

    double price;

    public Vehicle(Engine engine, GearBox gearbox, Tyres tyres, String colour, double price) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.tyres = tyres;
        this.colour = colour;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GearBox getGearbox() {
        return gearbox;
    }

    public void setGearbox(GearBox gearbox) {
        this.gearbox = gearbox;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
