
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * PowerOfFourTest
 */
public class PowerOfFourTest {

    private PowerOfFour cut;

    @Before
    public void setup() {
        cut = new PowerOfFour();
    }

    @Test
    public void testLeetCode1() {
        Assert.assertTrue(cut.isPowerOfFour(16));
    }

    @Test
    public void testLeetCode2() {
        Assert.assertFalse(cut.isPowerOfFour(5));
    }

    @Test
    public void testLeetCode3() {
        Assert.assertTrue(cut.isPowerOfFour(1));
    }
}
