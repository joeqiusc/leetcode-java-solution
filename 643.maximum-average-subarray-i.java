/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k > nums.length)
            return 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        for (int i = k; i < nums.length; i++) {
            max = Math.max(sum, max);
            sum = sum - nums[i - k] + nums[i];
        }
        // the last sum haven't compare with the max in the for loop, so, here need this
        // line
        max = Math.max(sum, max);
        return max / k;
    }
}
// @lc code=end
