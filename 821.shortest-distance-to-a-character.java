/*
 * @lc app=leetcode id=821 lang=java
 *
 * [821] Shortest Distance to a Character
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        int result[] = new int[s.length()];
        int fromL = Integer.MAX_VALUE;
        int formR = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                fromL = i;
            }
            result[i] = Math.abs(i - fromL);
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                formR = i;
            }
            result[i] = Math.min(result[i], Math.abs(formR - i));
        }
        return result;
    }
}
// @lc code=end
