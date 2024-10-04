
package io.github.mharbol.leetcode;

/**
 * SingleNumber
 * Solution class for Leet Code 136
 */
public class SingleNumber {

    /**
     * Finds the number listed once in an array where all elements appear twice
     * except for one.
     *
     * @param nums the oddly specific array of ints
     * @return the lone int that appears once (or really an odd number of times)
     */
    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int i : nums) {
            ret ^= i;
        }
        return ret;
    }
}
