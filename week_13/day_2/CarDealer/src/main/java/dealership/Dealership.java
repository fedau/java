package dealership;

import customer.Customer;
import vehicle.ElectricCar;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    public ArrayList<Vehicle> stock;

    double till;

    public Dealership(ArrayList<Vehicle> stock, double till) {
        this.stock = stock;
        this.till = till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (vehicle.getPrice() <= till){
            stock.add(vehicle);
            till -= vehicle.getPrice();}
    }

    public void sellToCustomer(Customer customer, Vehicle vehicle) {
        customer.buyVehicle(vehicle);
        this.till += vehicle.getPrice();
        stock.remove(vehicle);

    }
}
