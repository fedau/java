package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    Visitor visitorChild;

    Visitor visitorParent;
    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitorChild = new Visitor(12, 150, 15.5);
        visitorParent = new Visitor(18, 190, 35);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canGoOnPlayground() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitorChild));
    }

    @Test
    public void canNotGoOnPlayground(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitorParent));
    }
}
