/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        for (char c : s.toCharArray()) {
            int num = c - 'A' + 1;
            result = result * 26 + num;
        }
        return result;
    }
}
// @lc code=end
