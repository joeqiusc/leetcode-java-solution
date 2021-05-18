/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        int Acount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                Acount++;
            } else if (s.charAt(i) == 'L' && i + 2 < s.length() && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                return false;
            }
        }
        return Acount <= 1;
    }
}
// @lc code=end
