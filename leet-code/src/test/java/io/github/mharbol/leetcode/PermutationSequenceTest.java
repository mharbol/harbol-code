
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * PermutationSequenceTest
 * Test class for Leet Code 60
 */
public class PermutationSequenceTest {

    private PermutationSequence cut;

    @Before
    public void setup() {
        cut = new PermutationSequence();
    }

    @Test
    public void testLeet1() {
        Assert.assertEquals("213", cut.getPermutation(3, 3));
    }

    @Test
    public void testLeet2() {
        Assert.assertEquals("2314", cut.getPermutation(4, 9));
    }

    @Test
    public void testLeet3() {
        Assert.assertEquals("123", cut.getPermutation(3, 1));
    }

    @Test
    public void testSanityLen3() {
        Assert.assertEquals("123", cut.getPermutation(3, 1));
        Assert.assertEquals("132", cut.getPermutation(3, 2));
        Assert.assertEquals("213", cut.getPermutation(3, 3));
        Assert.assertEquals("231", cut.getPermutation(3, 4));
        Assert.assertEquals("312", cut.getPermutation(3, 5));
        Assert.assertEquals("321", cut.getPermutation(3, 6));
    }

    @Test
    public void testSanityLen4() {
        Assert.assertEquals("1234", cut.getPermutation(4, 1));
        Assert.assertEquals("1243", cut.getPermutation(4, 2));
        Assert.assertEquals("1324", cut.getPermutation(4, 3));
        Assert.assertEquals("1342", cut.getPermutation(4, 4));
        Assert.assertEquals("1423", cut.getPermutation(4, 5));
        Assert.assertEquals("1432", cut.getPermutation(4, 6));
        Assert.assertEquals("2134", cut.getPermutation(4, 7));
        Assert.assertEquals("2143", cut.getPermutation(4, 8));
        Assert.assertEquals("2314", cut.getPermutation(4, 9));
        Assert.assertEquals("2341", cut.getPermutation(4, 10));
        Assert.assertEquals("2413", cut.getPermutation(4, 11));
        Assert.assertEquals("2431", cut.getPermutation(4, 12));
        Assert.assertEquals("3124", cut.getPermutation(4, 13));
    }
}
