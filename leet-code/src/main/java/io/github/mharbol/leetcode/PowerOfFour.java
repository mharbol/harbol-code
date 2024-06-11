
package io.github.mharbol.leetcode;

/**
 * PowerOfFour
 * Wrapper class for LeetCode 342
 */
public class PowerOfFour {

    /**
     * Determines if a given int is a power of four
     * 
     * @param n the number in question
     * @return true if n is a power of four otherwise flase
     */
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }
}
