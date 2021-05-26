/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end - 1) {
            if (s.charAt(start) != s.charAt(end)) {
                if (isValid(s, start, end - 1)) {
                    return true;
                }
                if (isValid(s, start + 1, end)) {
                    return true;
                }
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean isValid(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
// @lc code=end
