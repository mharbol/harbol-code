
package io.github.mharbol.leetcode.jumpgame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * JumpGame3Test
 *
 * Test class for Leet Code 1306
 */
public class JumpGame3Test {

    private JumpGame3 cut;

    @Before
    public void setup() {
        cut = new JumpGame3();
    }

    @Test
    public void testLeet1() {
        int[] arr = new int[] { 4, 2, 3, 0, 3, 1, 2 };
        final int start = 5;
        Assert.assertTrue(cut.canReach(arr, start));
    }

    @Test
    public void testLeet2() {
        int[] arr = new int[] { 4, 2, 3, 0, 3, 1, 2 };
        final int start = 0;
        Assert.assertTrue(cut.canReach(arr, start));
    }

    @Test
    public void testLeet3() {
        int[] arr = new int[] {3,0,2,1,2};
        final int start = 2;
        Assert.assertFalse(cut.canReach(arr, start));
    }
}
