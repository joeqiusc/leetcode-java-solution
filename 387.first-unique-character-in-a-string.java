/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        // this solution rely on the character frequency in the string
        // if (s == null || s.length() == 0)
        // return -1;
        // int[] charMap = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        // charMap[s.charAt(i) - 'a']++;
        // }

        // for (int i = 0; i < s.length(); i++) {
        // if (charMap[s.charAt(i) - 'a'] == 1)
        // return i;
        // }
        // return -1;

        // This solution use the build in string method indexOf and lastIndexOf
        if (s == null || s.length() == 0)
            return -1;
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c))
                return s.indexOf(c);
        }
        return -1;
    }
}
// @lc code=end
