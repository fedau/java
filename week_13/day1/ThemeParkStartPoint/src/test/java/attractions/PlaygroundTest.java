package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorChild;

    Visitor visitorParent;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorChild = new Visitor(12, 150, 15.5);
        visitorParent = new Visitor(18, 190, 35);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canGoOnPlayground() {
        assertEquals(true, playground.isAllowedTo(visitorChild));
    }

    @Test
    public void canNotGoOnPlayground(){
        assertEquals(false, playground.isAllowedTo(visitorParent));
    }
}
