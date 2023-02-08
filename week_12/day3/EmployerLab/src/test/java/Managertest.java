import org.junit.Before;
import org.junit.Test;
import staff.managment.Manager;

import static org.junit.Assert.assertEquals;

public class Managertest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Michael", 34560822, 50000.45, "Scranton");
    }

    @Test

    public void canRaiseSalery(){
        assertEquals(55000.45, manager.raiseSalery(5000), 0.0);
    }

    @Test
    public void payBonusAmount(){
        assertEquals(500.0045, manager.payBonus(), 0.0);
    }
}
