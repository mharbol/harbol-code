
package io.github.mharbol.leetcode;

/**
 * PermutationInString
 *
 * Solution class for Leet Code 567
 */
public class PermutationInString {

    /**
     * Check if one string contains a permutation substring of the other.
     * 
     * @param s1 the String to check permutations for
     * @param s2 the String to search for a permutation in
     * @return true if a permutation of s1 is found in s2 otherwise false
     */
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] baseFreq = new int[26];
        int[] subsFreq = new int[26];

        for (int idx = 0; idx < s1.length(); idx++) {
            baseFreq[s1.charAt(idx) - 'a']++;
            subsFreq[s2.charAt(idx) - 'a']++;
        }
        if (arrsEqual(baseFreq, subsFreq)) {
            return true;
        }
        int left = 0;
        int right = s1.length();
        while (right < s2.length()) {
            subsFreq[s2.charAt(left++) - 'a']--;
            subsFreq[s2.charAt(right++) - 'a']++;
            if (arrsEqual(baseFreq, subsFreq)) {
                return true;
            }
        }
        return false;
    }

    private boolean arrsEqual(final int[] arr1, final int[] arr2) {
        for (int idx = 0; idx < arr1.length; idx++) {
            if (arr1[idx] != arr2[idx]) {
                return false;
            }
        }
        return true;
    }
}
