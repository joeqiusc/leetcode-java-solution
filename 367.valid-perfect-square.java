/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num / i; i++) {
            if (i * i == num)
                return true;
        }
        return false;
    }
}
// @lc code=end
