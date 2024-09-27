
package io.github.mharbol.leetcode;

import io.github.mharbol.util.TreeNode;

/**
 * MinDepthBinTree
 * Solution class for Leet Code 111
 */
public class MinDepthBinTree {

    /**
     * Determines the minumum depth from the root to a leaf node.
     *
     * @param root the root of the binary tree
     * @return the shortest length from the root to any leaf node
     */
    public int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int dLeft = minDepth(root.left);
        int dRight = minDepth(root.right);
        if (0 == dLeft) {
            return 1 + dRight;
        }  else if (0 == dRight) {
            return 1 + dLeft;
        } else {
            return 1 + (dLeft > dRight ? dRight : dLeft);
        }
    }
}
