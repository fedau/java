package vehicle;

import org.junit.Before;
import org.junit.Test;
import vehicle.parts.Engine;
import vehicle.parts.GearBox;
import vehicle.parts.Tyres;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;

    GearBox gearbox;

    Tyres tyres;

    @Before
    public void before(){
        Engine engine = new Engine(180);
       GearBox gearbox = new GearBox(6);
        Tyres tyres = new Tyres(4);
        car = new Car(engine, gearbox, tyres, "Blue", 20000, 300);
    }

    @Test
    public void getCarPrice(){
        assertEquals(20000, car.getPrice(), 0.1);
    }
}
