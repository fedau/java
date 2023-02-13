package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorChild;

    Visitor visitorParent;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitorChild = new Visitor(12, 140, 15.5);
        visitorParent = new Visitor(18, 200, 35);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void priceForChildISHalf(){
        assertEquals(2.25, dodgems.priceFor(visitorChild), 0.1);
    }

    @Test
    public void priceforAdult(){
        assertEquals(4.5, dodgems.priceFor(visitorParent), 0.1);
    }
}
