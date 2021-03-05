import java.util.Arrays;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        return nums[(nums.length - 1) / 2];
    }
}
// @lc code=end
