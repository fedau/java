package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorChild;

    Visitor visitorParent;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorChild = new Visitor(12, 140, 15.5);
        visitorParent = new Visitor(18, 200, 35);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRollerCoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitorParent));
    }
    @Test
    public void canNotRollerCoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorChild));
    }

    @Test
    public void priceForRollerCoaster(){
        assertEquals(8.4, rollerCoaster.priceFor(visitorChild), 0.1);
    }
    @Test
    public void priceForTallPeople(){
        assertEquals(16.8, rollerCoaster.priceFor(visitorParent), 0.1);
    }
}
