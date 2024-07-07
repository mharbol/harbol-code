
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * UglyNumberTest
 *
 * Test class for Leet Code 263
 */
public class UglyNumberTest {

    private UglyNumber cut;

    @Before
    public void setup() {
        cut = new UglyNumber();
    }

    @Test
    public void testLeetCode1() {
        Assert.assertTrue(cut.isUgly(6));
    }

    @Test
    public void testLeetCode2() {
        Assert.assertTrue(cut.isUgly(1));
    }

    @Test
    public void testLeetCode3() {
        Assert.assertFalse(cut.isUgly(14));
    }

    // These were gotchas because the description was unclear.
    @Test
    public void testGotcha1() {
        Assert.assertFalse(cut.isUgly(-1000));
    }

    @Test
    public void testGotcha2() {
        Assert.assertFalse(cut.isUgly(0));
    }
}
