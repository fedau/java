package customer;

import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.ElectricCar;
import vehicle.Vehicle;
import vehicle.parts.Engine;
import vehicle.parts.GearBox;
import vehicle.parts.Tyres;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Customertest {

    Customer customer;
    Car car;

    Engine engine;

    GearBox gearbox;

    Tyres tyres;

    ElectricCar electricCar;
    ElectricCar electricCar1;

    @Before
    public void before() {
        Engine engine = new Engine(180);
        GearBox gearbox = new GearBox(6);
        Tyres tyres = new Tyres(4);
        electricCar = new ElectricCar(engine, gearbox, tyres, "Blue", 20000, "90Whats");
        electricCar1 = new ElectricCar(engine, gearbox, tyres, "Blue", 45000, "90Whats");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(electricCar);
        customer = new Customer(40000, vehicles);
    }

    @Test
    public void getCarsOwend(){
        assertEquals(1, customer.ownedVehicles.size());
    }

    @Test
    public  void customerCanBUY(){
        customer.buyVehicle(electricCar);
        assertEquals(2, customer.ownedVehicles.size());
    }
    @Test
    public void customerTotalAfterSale(){
        customer.buyVehicle(electricCar);
        assertEquals(20000, customer.getMoney(), 0.1);

    }

    @Test
    public void customerTotalAfterSaleWhenPriceISToHigh(){
        customer.buyVehicle(electricCar1);
        assertEquals(40000, customer.getMoney(), 0.1);

    }


}
