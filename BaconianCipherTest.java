

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BaconianCipherTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BaconianCipherTest
{
    /**
     * Default constructor for test class BaconianCipherTest
     */
    public BaconianCipherTest()
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
    public void testEncode()
    {
        String msg="Knowledge is power.";
        BaconianCipher.encode(msg);
        assertEquals("abaababbaaabbabbabaaababaaabaaaaabbaabbaaabaa abaaabaaab abbbaabbabbabaaaabaabaaaa.", BaconianCipher.encode(msg));
    }
}
