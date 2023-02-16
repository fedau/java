package vehicle.parts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres= new Tyres(4);
    }

    @Test
    public void getTyres(){
        assertEquals(4, tyres.getTyres());
    }
}
