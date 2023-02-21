package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CarOwnerTest {
    public static final String JOHN_DOE = "John Doe";
    private CarOwner carOwner;
    private Car car;

    @Before
    public void constructCarOwnerTestObject() {
        car = new Car(CarTest.BEETLE);
        carOwner = new CarOwner(JOHN_DOE, car);

    }

    @Test
    public void getName() {
        assertEquals(JOHN_DOE, carOwner.getName());
    }

}
