/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x >= 0 && x <= 9)
            return true;
        if (x % 10 == 0)
            return false;
        int rev = 0;
        while (x >= rev) {
            if (x == rev)
                return true;
            rev = rev * 10 + x % 10;
            if (x == rev)
                return true;
            x = x / 10;
        }
        return false;
    }
}

// @lc code=end
