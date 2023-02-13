import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {




    @Test
    public void canConvertCar(){
        //given we have a car
        Car car = new Car ("Tesla", 3);
//        when passing through the converyer
        String message = Converter.process(car);
        // then we should see some converted string
        assertEquals("Car data", message);
    }
}
