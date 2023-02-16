package customer;

import vehicle.Car;
import vehicle.ElectricCar;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

    double money;

    public ArrayList<Vehicle> ownedVehicles;

    public Customer(double money, ArrayList<Vehicle> ownedVehicles) {
        this.money = money;
        this.ownedVehicles = ownedVehicles;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (vehicle.getPrice() <= money){
        ownedVehicles.add(vehicle);
        money -= vehicle.getPrice();}
    }
}
