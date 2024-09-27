
package io.github.mharbol.leetcode;

import io.github.mharbol.util.TreeNode;

/**
 * PathSum
 * Solution class for Leet Code 112
 */
public class PathSum {

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
