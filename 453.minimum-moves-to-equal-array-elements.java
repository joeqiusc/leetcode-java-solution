/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 */

// @lc code=start
class Solution {
    public int minMoves(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            sum += i;
            min = Math.min(min, i);
        }
        return sum - min * nums.length;
    }
}
// @lc code=end
