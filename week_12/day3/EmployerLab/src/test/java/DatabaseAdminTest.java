import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Dwight", 32948, 2000.30);
    }

    @Test
    public void canPayRaise(){
        assertEquals(2200.30, databaseAdmin.raiseSalery(200.3), 0.0);
    }

    @Test
    public  void whatisBonus(){
        assertEquals(200.003, databaseAdmin.payBonus(),0.0);
    }
}
