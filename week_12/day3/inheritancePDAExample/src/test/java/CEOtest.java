import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CEOtest {
    CEO ceo;

    @Before
    public void before(){
        ceo = new CEO ("Ronald McDonald", 100500.00, 90000);

    }

    @Test
    public void canRaiseSalery(){
        assertEquals(200500, ceo.raiseSalary(100000), 0.1);
    }
}
