/*
 * @lc app=leetcode id=657 lang=java
 *
 * [657] Robot Return to Origin
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
        int h = 0;
        int v = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    h++;
                    break;
                case 'L':
                    h--;
                    break;
                case 'U':
                    v++;
                    break;
                case 'D':
                    v--;
                    break;
                default:
            }
        }
        return h == 0 && v == 0;
    }
}
// @lc code=end
