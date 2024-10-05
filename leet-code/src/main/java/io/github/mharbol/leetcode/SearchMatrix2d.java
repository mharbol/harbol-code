
package io.github.mharbol.leetcode;

/**
 * SearchMatrix2d
 * Solution class for Leet Code 74
 */
public class SearchMatrix2d {

    /**
     * Searches the sorted 2D matrix for the given target value.
     *
     * @param matrix the matrix to search
     * @param target the value to search for
     * @return true if the value is in the matrix otherwise false
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // binary search for row
        int left = 0;
        int right = matrix.length - 1;
        int mid = 0, num;
        while (left <= right) {
            mid = left + (right - left) / 2;
            num = matrix[mid][0];
            if (target == num) {
                return true;
            }
            if (target > num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        final int rowIdx = (0 > right) ? 0 : right;
        // binary search for value
        left = 0;
        right = matrix[rowIdx].length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            num = matrix[rowIdx][mid];
            if (target == num) {
                return true;
            }
            if (target > num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
