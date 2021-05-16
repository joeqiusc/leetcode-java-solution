/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        int diff = x ^ y;
        while (diff != 0) {
            result += diff & 1;
            diff = diff >> 1;
        }
        return result;
    }
}
// @lc code=end
