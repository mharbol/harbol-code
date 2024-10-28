
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * PermutationInStringTest
 */
public class PermutationInStringTest {

    private PermutationInString cut;

    @Before
    public void setup() {
        cut = new PermutationInString();
    }

    @Test
    public void testLeet1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        Assert.assertTrue(cut.checkInclusion(s1, s2));
    }

    @Test
    public void testLeet2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        Assert.assertFalse(cut.checkInclusion(s1, s2));
    }
}
