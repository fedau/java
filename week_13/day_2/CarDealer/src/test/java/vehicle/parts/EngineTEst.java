package vehicle.parts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTEst {
    
    Engine engine;
    
    @Before
    public void before(){
        engine = new Engine(200);
    }
    
    @Test
    public void getHorsepower(){
        assertEquals(200, engine.getHoresePower());
    }


}
