

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DriverTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DriverTest
{
    private Driver driver1;

    /**
     * Default constructor for test class DriverTest
     */
    public DriverTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        driver1 = new Driver();
        driver1.getAge();
        driver1.getName();
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAge()
    {
        Driver driver1 = new Driver();
        assertEquals(15, driver1.getAge());
    }

    @Test
    public void testName()
    {
        Driver driver1 = new Driver();
        assertEquals("testing", driver1.getName());
    }
}


