import java.util.HashSet;

/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                result += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if (set.size() > 0)
            return result + 1;
        else
            return result;
    }
}
// @lc code=end
