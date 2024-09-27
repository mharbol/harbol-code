
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.mharbol.util.TreeNode;

/**
 * MinDepthBinTreeTest
 */
public class MinDepthBinTreeTest {

    MinDepthBinTree cut;

    @Before
    public void setup() {
        cut = new MinDepthBinTree();
    }

    @Test
    public void testLeet1() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(50, new TreeNode(15), new TreeNode(7)));
        Assert.assertEquals(2, cut.minDepth(root));
    }

    @Test
    public void testLeet2() {
        TreeNode root = new TreeNode(2, null,
                new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        Assert.assertEquals(5, cut.minDepth(root));
    }
}
