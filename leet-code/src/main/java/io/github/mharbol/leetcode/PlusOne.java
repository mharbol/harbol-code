
package io.github.mharbol.leetcode;

/**
 * PlusOne
 * Solution class for LeetCode 66 Plus One
 */
public class PlusOne {

    /**
     * Perform adding one to the array of digits.
     *
     * @param digits the digits to add one to
     * @return the result of adding one as an array
     */
    public int[] plusOne(int[] digits) {
        return plusOne(digits, digits.length - 1);
    }

    /**
     * Add one to the selected digit. Recurse if needed.
     *
     * @param digits the current digits
     * @param idx    the index of the digit to add one to
     * @return the result of adding one as an array
     */
    private int[] plusOne(int[] digits, int idx) {
        if (0 == idx && 9 == digits[idx]) {
            int[] ret = new int[digits.length + 1];
            ret[0] = 1;
            return ret;
        } else if (digits[idx] < 9) {
            digits[idx]++;
            return digits;
        } else {
            digits[idx] = 0;
            return plusOne(digits, idx - 1);
        }
    }
}
