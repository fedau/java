import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;

    @Before
    public void before(){
        flight = new Flight();
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
