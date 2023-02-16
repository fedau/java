package dealership;

import customer.Customer;
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

public class DealershipTest {

    Car car;

    Engine engine;

    GearBox gearbox;

    Tyres tyres;

   public ElectricCar electricCar;
    Dealership dealership;
    ElectricCar electricCar1;

    Customer customer;


    @Before
    public void before(){
        Engine engine = new Engine(180);
        GearBox gearbox = new GearBox(6);
        Tyres tyres = new Tyres(4);
        electricCar = new ElectricCar(engine, gearbox, tyres, "Blue", 20000, "90Whats");
        electricCar1 = new ElectricCar(engine, gearbox, tyres, "Blue", 45000, "90Whats");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(electricCar);
        vehicles.add(electricCar);
        customer = new Customer(40000, vehicles);
        dealership = new Dealership(vehicles, 100500);



    }

    @Test
    public void howManyCarsInStock(){
        assertEquals(2, dealership.stock.size());
    }

    @Test
    public  void dealerCanBUY(){
        dealership.buyVehicle(electricCar);
        assertEquals(3, dealership.stock.size());
    }
    @Test
    public void dealerTotalAfterSale(){
        dealership.buyVehicle(electricCar);
        assertEquals(80500, dealership.getTill(), 0.1);

    }

    @Test
    public void canSellCarToCustomer(){
        dealership.sellToCustomer(customer, electricCar);
        assertEquals(1, dealership.stock.size());
    }

    @Test
    public void canSellCarToCustomerGetTill(){
        dealership.sellToCustomer(customer, electricCar);
        assertEquals(120500, dealership.getTill(), 0.1);
    }

    @Test
    public void canSellCarToCustomerGetCustomerStock(){
        dealership.sellToCustomer(customer, electricCar);
        assertEquals(3, customer.ownedVehicles.size());
    }


}
