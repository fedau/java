package vehicle;

import org.junit.Before;
import org.junit.Test;
import vehicle.parts.Engine;
import vehicle.parts.GearBox;
import vehicle.parts.Tyres;

import static org.junit.Assert.assertEquals;

public class ElectriccarTEst {

    ElectricCar electricCar;
    Engine engine;

    GearBox gearbox;

    Tyres tyres;

    @Before
    public void before(){
        Engine engine = new Engine(180);
        GearBox gearbox = new GearBox(6);
        Tyres tyres = new Tyres(4);
        electricCar = new ElectricCar(engine, gearbox, tyres, "Blue", 20000, "90Whats" );
    }

    @Test
    public void getElectricPrice(){
        assertEquals(20000, electricCar.getPrice(), 0.1);
    }

    @Test
    public void getBatterySize(){
        assertEquals("90Whats", electricCar.getBatterySize());
    }
}
