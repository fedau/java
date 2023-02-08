import org.junit.Before;
import org.junit.Test;
import staff.managment.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jan", 324325, 100500.00, "Boston", 403020);
    }

    @Test
    public void testSaleryRaise(){
        assertEquals(150500.00, director.raiseSalery(50000), 0.0);
    }

    @Test
    public void whatIsBonusAmount(){
        assertEquals(2010, director.payBonus(), 0.0);
    }

    @Test
    public void whatIsBudget(){
        assertEquals(403020, director.getBudget() , 0.0);
    }
}
