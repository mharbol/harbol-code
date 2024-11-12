
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * TwoSumTest
 * Test class for Leet Code 1
 */
public class TwoSumTest {

    private TwoSum cut;

    @Before
    public void setup() {
        cut = new TwoSum();
    }

    @Test
    public void testLeet1() {
        int[] actual = cut.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        Assert.assertArrayEquals(new int[] { 0, 1 }, actual);
    }

    @Test
    public void testLeet2() {
        int[] actual = cut.twoSum(new int[] { 3, 2, 4 }, 6);
        Assert.assertArrayEquals(new int[] { 1, 2 }, actual);
    }

    @Test
    public void testLeet3() {
        int[] actual = cut.twoSum(new int[] { 3, 3 }, 6);
        Assert.assertArrayEquals(new int[] { 0, 1 }, actual);
    }
}
