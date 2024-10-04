
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * SingleNumberTest
 */
public class SingleNumberTest {

    private SingleNumber cut;

    @Before
    public void setup() {
        cut = new SingleNumber();
    }

    @Test
    public void testLeet1() {
        Assert.assertEquals(1, cut.singleNumber(new int[] { 2, 2, 1 }));
    }

    @Test
    public void testLeet2() {
        Assert.assertEquals(4, cut.singleNumber(new int[] { 4, 1, 2, 1, 2 }));
    }

    @Test
    public void testLeet3() {
        Assert.assertEquals(1, cut.singleNumber(new int[] { 1 }));
    }
}
