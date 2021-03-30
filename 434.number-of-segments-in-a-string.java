/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        if (s == null || s.length() == 0)
            return 0;
        String[] strs = s.split(" ");
        int res = 0;
        for (String str : strs) {
            if (!str.trim().equals(""))
                res++;
        }
        return res;
    }
}
// @lc code=end
