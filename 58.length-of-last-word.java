/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                res = 0;
            else
                res++;
        }
        return res;
    }
}
// @lc code=end
