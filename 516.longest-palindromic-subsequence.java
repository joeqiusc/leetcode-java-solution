/*
 * @lc app=leetcode id=516 lang=java
 *
 * [516] Longest Palindromic Subsequence
 */

// @lc code=start
class Solution {
    public int longestPalindromeSubseq(String s) {

        // the dp recurcive solution, unforturnately, it can't pass the time limited of
        // leetcode
        // if (s == null || s.length() == 0)
        // return 0;
        // return dp(s, 0, s.length() - 1);
        // }

        // private int dp(String s, int i, int j) {
        // if (i > j)
        // return 0;
        // if (i == j)
        // return 1;
        // if (s.charAt(i) == s.charAt(j)) {
        // return dp(s, i + 1, j - 1) + 2;
        // }
        // return Integer.max(dp(s, i, j - 1), dp(s, i + 1, j));

        // save the dp result to the two D array.
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = len - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][len - 1];
    }
}
// @lc code=end
