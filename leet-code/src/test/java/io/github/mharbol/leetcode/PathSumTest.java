
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.mharbol.util.TreeNode;

/**
 * PathSumTest
 * Test class for Leet Code 112
 */
public class PathSumTest {

    private PathSum cut;

    @Before
    public void setup() {
        cut = new PathSum();
    }

    @Test
    public void testLeet1() {
        TreeNode root = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(1, null, new TreeNode(1));
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11, new TreeNode(7), new TreeNode(2));
        Assert.assertTrue(cut.hasPathSum(root, 22));
    }

    @Test
    public void testLeet2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assert.assertFalse(cut.hasPathSum(root, 5));
    }

    @Test
    public void testLeet3() {
        Assert.assertFalse(cut.hasPathSum(null, 0));
    }
}
