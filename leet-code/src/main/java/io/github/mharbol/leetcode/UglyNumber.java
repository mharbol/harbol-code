package io.github.mharbol.leetcode;

/**
 * UglyNumber
 * Wrapper class for LeetCode 263 Ugly Number
 */
public class UglyNumber {

    /**
     * Determines if a number is "ugly" in that its prime factors only consists
     * of 2, 3, and 5... and is positive I guess.
     *
     * @param n the number to test for ugliness
     * @return true if n is ugly otherwise false
     */
    public boolean isUgly(int n) {
        if (0 >= n) {
            return false;
        }
        while (0 == n % 5) {
            n /= 5;
        }
        while (0 == n % 3) {
            n /= 3;
        }
        while (0 == n % 2) {
            n /= 2;
        }
        return n == 1;
    }
}
