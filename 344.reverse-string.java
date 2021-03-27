/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length <= 1)
            return;
        int start = 0, end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
// @lc code=end
