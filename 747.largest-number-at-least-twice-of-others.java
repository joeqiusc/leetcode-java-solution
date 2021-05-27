/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && max < 2 * nums[i])
                return -1;
        }
        return index;
    }
}
// @lc code=end
