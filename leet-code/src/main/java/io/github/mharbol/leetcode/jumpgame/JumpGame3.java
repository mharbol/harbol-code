
package io.github.mharbol.leetcode.jumpgame;

/**
 * JumpGame3
 *
 * Wrapper class for Leet Code 1306
 */
public class JumpGame3 {

    /**
     * Determines if it is possible to reach a 0 following the rules of LeetCode
     * 1306
     *
     * @param arr   the array of ints to jump along
     * @param start starting index of the jumps
     * @return true if possible otherwise false
     */
    public boolean canReach(int[] arr, int start) {
        final int num = arr[start];
        // Base Cases:
        if (0 == num) {
            return true;
        } else if (0 > num) {
            // already visited
            return false;
        }
        arr[start] = -num; // negative marks visited
        return (0 <= start - num && canReach(arr, start - num)) ||
                (arr.length > start + num && canReach(arr, start + num));
    }
}
