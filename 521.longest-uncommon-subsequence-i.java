/*
 * @lc app=leetcode id=521 lang=java
 *
 * [521] Longest Uncommon Subsequence I
 */

// @lc code=start
class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
// @lc code=end
