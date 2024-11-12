
package io.github.mharbol.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum
 * Solution class for Leet Code 1
 */
public class TwoSum {
    /**
     * Get the indices of the two numbers that add up to the desired sum.
     *
     * @param nums   list of potential numbers adding up to the target sum
     * @param target the desired sum
     * @return an array of size 2 with the indices of the two numbers totalling to
     *         `target`
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> compMap = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++) {
            final int num = nums[idx];
            if (compMap.keySet().contains(num)) {
                return new int[] { compMap.get(num), idx };
            } else {
                compMap.put(target - num, idx);
            }
        }
        return null; // never should get here
    }
}
