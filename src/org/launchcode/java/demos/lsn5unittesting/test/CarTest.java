package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

//can  put in the after, before class etc instead of star.

@RunWith(JUnit4.class)

public class CarTest {
    Car test_car;
    //this is only run  once for the entire test at the beginning.
    @BeforeClass
    public static void setup(){
        System.out.println("Starting  unit tests CarTests");
    }

    //This is run once before EVERY test!
    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //Test an empty test
    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);

    }

    @Test
    public void testNotNull(){
        assertNotNull(test_car);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testInitialGasTank_false(){
        assertFalse("The gas tank has a capacity of 10", test_car.getGasTankLevel() == 0);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void gasTankLevel(){
        test_car.drive(501);
        assertEquals(-1, test_car.getGasTankLevel(), 001);
    }
    //TODO: can't have more gas than tank size, expect an exception

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");

    }
//    //This code is run once before EVERY test!
//    @After
//    //Only run once at the end of all tests.
//    @AfterClass

}
