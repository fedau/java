import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Pam", 234543, 40000.89 );
    }

    @Test
    public void canRaiseSalery(){
        assertEquals(40004.89, developer.raiseSalery(4), 0.0);
    }

    @Test
    public void findPayBonusamount(){
        assertEquals(400.0089, developer.payBonus(), 0.0);
    }
}
