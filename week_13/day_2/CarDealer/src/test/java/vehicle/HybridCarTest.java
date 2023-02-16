package vehicle;

import org.junit.Before;
import org.junit.Test;
import vehicle.parts.Engine;
import vehicle.parts.GearBox;
import vehicle.parts.Tyres;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    HybridCar hybridCar;
    Engine engine;

    GearBox gearbox;

    Tyres tyres;

    @Before
    public void before(){
        Engine engine = new Engine(180);
        GearBox gearbox = new GearBox(6);
        Tyres tyres = new Tyres(4);
        hybridCar = new HybridCar(engine, gearbox, tyres, "Blue", 20000,300, "90Whats" );
    }

    @Test
    public void getHybridPrice(){
        assertEquals(20000, hybridCar.getPrice(), 0.1);
    }

    @Test
    public void getBatterySize(){
        assertEquals("90Whats", hybridCar.getBatterySize());
    }

}
