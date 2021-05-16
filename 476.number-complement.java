/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        int m = (Integer.highestOneBit(num) << 1) - 1;
        return num ^ m;
    }
}
// @lc code=end
