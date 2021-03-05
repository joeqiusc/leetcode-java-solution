import javax.lang.model.util.ElementScanner6;

/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            char charL = s.charAt(left);
            char charR = s.charAt(right);
            if (!Character.isLetterOrDigit(charL)) {
                left++;
            } else if (!Character.isLetterOrDigit(charR)) {
                right--;
            } else {
                if (Character.toLowerCase(charL) != Character.toLowerCase(charR))
                    return false;
                left++;
                right--;
            }

        }
        return true;
    }
}
// @lc code=end
