/*
 * @lc app=leetcode id=806 lang=java
 *
 * [806] Number of Lines To Write String
 */

// @lc code=start
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int pos = 0;
        int line = 1;
        for (int i = 0; i < s.length(); i++) {
            pos += widths[s.charAt(i) - 'a'];
            if (pos > 100) {
                line++;
                pos = 0;
                i--;
            }
        }
        int res[] = new int[2];
        res[0] = line;
        res[1] = pos;
        return res;
    }
}
// @lc code=end
