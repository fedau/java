import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;
    Rank rank;


    @Before
    public void before(){
        pilot = new Pilot("Garfield", rank.PILOT, "fjsdakl");

    }

    @Test
    public void pilotCanFly(){
        assertEquals("I am flying", pilot.fly());
    }
}
