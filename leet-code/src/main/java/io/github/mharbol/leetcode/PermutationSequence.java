
package io.github.mharbol.leetcode;

/**
 * PermutationSequence
 * Solution class for Leet Code 60
 */
public class PermutationSequence {

    /**
     * Get the k-th permutatation of the of the integers [1, n].
     * For example if n=3 then for k=3, the 3rd permutation sequence is "213".
     * 
     * @param n number of integers in the sequence
     * @param k the index of the desired permutation
     * @return the k-th permutation of n integers as a String
     */
    public String getPermutation(int n, int k) {

        char[] perm = new char[n];
        char ch = '1';
        for (int i = 0; i < n; i++) {
            perm[i] = ch++;
        }

        permSwap(perm, n, k - 1, fac(n - 1, 1));

        return new String(perm);
    }

    /**
     * Goes down the starts of the permutation groups of given leading digit we are
     * dealing with and swaps with the next highest digit until it cannot anymore.
     * Then calls itself on the next permutation group.
     * 
     * @param arr   the array of chars to permute
     * @param n     the level we are dealing on
     * @param k     how many permutations we have left to go
     * @param n1fac value of (n - 1)!
     */
    private void permSwap(char[] arr, int n, int k, int n1fac) {
        if (0 == k) {
            return;
        }
        final int idxLeft = arr.length - n;
        int idxRight = idxLeft;
        char tmp;
        while (k >= n1fac) {
            tmp = arr[++idxRight];
            arr[idxRight] = arr[idxLeft];
            arr[idxLeft] = tmp;
            k -= n1fac;
        }
        permSwap(arr, n - 1, k, n1fac / (n - 1));
    }

    /**
     * Very lazy factorial
     *
     * @param n    number to factorial
     * @param prev previous number in tail recursion
     * @return n!
     */
    private int fac(int n, int prev) {
        return (0 == n) ? prev : fac(n - 1, prev * n);
    }
}
