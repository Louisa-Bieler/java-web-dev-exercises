package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {


    Car test_car = new Car("Toyota", "Prius", 10, 50);

    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), 0.001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range

    @Test
    public void testDrivenGasTank() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), 0.001);
    }
    @Test
    public void testEmptyGasTank() {
        test_car.drive((test_car.getMilesPerGallon()*test_car.getGasTankLevel())+1);
        assertEquals(0, test_car.getGasTankLevel(), 0.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void addTooMuchGas() {
        test_car.addGas(10);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}
