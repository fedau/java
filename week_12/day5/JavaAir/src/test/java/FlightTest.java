import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    Pilot pilot;

    Plane plane;

    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        pilot = new Pilot("Willy",Rank.PILOT, "dskld" );
        flight = new Flight(plane, pilot ,"GLA", "DIR", "2022", "sdjhf");
        passenger = new Passenger("Roony", 2);
    }

    @Test
    public void flightCanGetCapacity(){
        assertEquals(2, flight.getCapacity(PlaneType.CARGO));
    }

    @Test
    public void flightCanAddPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getTotalPassengers());
    }
}
