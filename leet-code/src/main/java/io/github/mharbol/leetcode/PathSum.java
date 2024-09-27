
package io.github.mharbol.leetcode;

import io.github.mharbol.util.TreeNode;

/**
 * PathSum
 * Solution class for Leet Code 112
 */
public class PathSum {

    /**
     * Determines if the tree has a path from the root to a leaf that totals to the
     * target sum.
     *
     * @param root      the root of the given tree
     * @param targetSum the target sum of the path
     * @return true if the tree has at least one path, otherwise false
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (null == root) {
            return false;
        }
        targetSum -= root.val;
        if (null == root.left && null == root.right) {
            return 0 == targetSum;
        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
