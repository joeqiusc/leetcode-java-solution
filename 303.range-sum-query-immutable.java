/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */

// @lc code=start
class NumArray {

    int[] sum;

    public NumArray(int[] nums) {
        if (nums.length > 0) {
            sum = new int[nums.length];
            sum[0] = nums[0];
            // caculate each sum of i, and save it into sum array;
            for (int i = 1; i < nums.length; i++) {
                sum[i] = sum[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int left, int right) {
        // if left is the first element, we can't minues the i-1, because it out of
        // boundary;
        if (left == 0)
            return sum[right];
        else
            return sum[right] - sum[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(left,right);
 */
// @lc code=end
