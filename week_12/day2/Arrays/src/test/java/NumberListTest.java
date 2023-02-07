import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;


    @Before
    public void before(){
        myNumbers = new NumberList();
    }

    @Test
    public void hasNumberofEntries(){
        assertEquals(0, myNumbers.getNumberCount());
    }

    @Test
    public void addNumberToList(){
        myNumbers.addNumbers(12);
        assertEquals(1, myNumbers.getNumberCount());
    }

}
