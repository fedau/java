import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }
    @Test
    public void calulatorCanAdd(){
        assertEquals(37, calculator.add(32, 5));
    }

    @Test
    public void calculatorCanSubstract(){
        assertEquals(27, calculator.subtract(32, 5));
    }

    @Test
    public void calculatorCanDivide(){
        assertEquals(6.4, calculator.divide(32, 5), 0.0);
    }
}
