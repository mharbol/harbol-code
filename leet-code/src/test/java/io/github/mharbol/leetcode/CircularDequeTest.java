
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * CircularDequeTest
 */
public class CircularDequeTest {

    private CircularDeque cut;

    @Before
    public void setup() {
    }

    @Test
    public void testLeet1() {
        cut = new CircularDeque(3);
        Assert.assertTrue(cut.insertLast(1));
        Assert.assertTrue(cut.insertLast(2));
        Assert.assertTrue(cut.insertFront(3));
        Assert.assertFalse(cut.insertFront(4)); // deque is full
        Assert.assertEquals(2, cut.getRear());
        Assert.assertTrue(cut.isFull());
        Assert.assertTrue(cut.deleteLast());
        Assert.assertTrue(cut.insertFront(4));
        Assert.assertEquals(4, cut.getFront());
    }
}
