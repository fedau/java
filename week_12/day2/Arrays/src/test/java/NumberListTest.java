import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;


    @Before
    public void before(){
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(1);
        testNumbers.add(10);
        testNumbers.add(10);
        myNumbers = new NumberList(testNumbers);

    }

    @Test
    public void hasNumberofEntries(){
        assertEquals(4, myNumbers.getNumberCount());
    }

    @Test
    public void addNumberToList(){
        myNumbers.addNumbers(12);
        assertEquals(5, myNumbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumber(){
        myNumbers.addNumbers(12);
        assertEquals(1, myNumbers.getNumberAtIndex(0));
    }

    @Test
    public void canGetTotal(){
        assertEquals(22, myNumbers.getTotal());

    }

}
