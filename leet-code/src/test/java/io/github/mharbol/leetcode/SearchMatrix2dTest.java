
package io.github.mharbol.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * SearchMatrix2dTest
 */
public class SearchMatrix2dTest {

    private SearchMatrix2d cut;

    @Before
    public void setup() {
        cut = new SearchMatrix2d();
    }

    @Test
    public void testLeet1() {
        final int[][] matrix = new int[][] {
                new int[] { 1, 3, 5, 7 },
                new int[] { 10, 11, 16, 20 },
                new int[] { 23, 30, 34, 60 },
        };
        Assert.assertTrue(cut.searchMatrix(matrix, 3));
    }

    @Test
    public void testLeet2() {
        final int[][] matrix = new int[][] {
                new int[] { 1, 3, 5, 7 },
                new int[] { 10, 11, 16, 20 },
                new int[] { 23, 30, 34, 60 },
        };
        Assert.assertFalse(cut.searchMatrix(matrix, 13));
    }

    @Test
    public void testOneRow() {
        final int[][] matrix = new int[][] { new int[] { 3, 5, 7, 12 } };
        Assert.assertTrue(cut.searchMatrix(matrix, 7));
        Assert.assertFalse(cut.searchMatrix(matrix, 10));
    }

    @Test
    public void testOneCol() {
        final int[][] matrix = new int[][] {
                new int[] { 2 },
                new int[] { 4 },
                new int[] { 5 },
                new int[] { 12 },
                new int[] { 14 },
        };
        Assert.assertTrue(cut.searchMatrix(matrix, 5));
        Assert.assertFalse(cut.searchMatrix(matrix, 16));
    }

    @Test
    public void testSingleNumber() {
        final int[][] matrix = new int[][] { new int[] { 234 } };
        Assert.assertTrue(cut.searchMatrix(matrix, 234));
        Assert.assertFalse(cut.searchMatrix(matrix, 16));
    }
}
