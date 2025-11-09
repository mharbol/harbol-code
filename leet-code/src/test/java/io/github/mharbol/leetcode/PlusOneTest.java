
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * PlusOneTest
 */
public class PlusOneTest {

    private PlusOne cut;

    @Before
    public void setUp() {
        cut = new PlusOne();
    }

    @Test
    public void testLeet1() {
        Assert.assertArrayEquals(new int[] { 1, 2, 4 }, cut.plusOne(new int[] { 1, 2, 3 }));
    }

    @Test
    public void testLeet2() {
        Assert.assertArrayEquals(new int[] { 4, 3, 2, 2 }, cut.plusOne(new int[] { 4, 3, 2, 1 }));
    }

    @Test
    public void testLeet3() {
        Assert.assertArrayEquals(new int[] { 1, 0 }, cut.plusOne(new int[] { 9 }));
    }
}
