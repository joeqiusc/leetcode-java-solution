import java.util.Arrays;

/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // The most straight forward way is by sorting the array then returen the
        // nums.length-k
        // Arrays.sort(nums);
        // return nums[nums.length - k];

        return quickSelect(nums, 0, nums.length - 1, k);
    }

    private int quickSelect(int[] nums, int low, int high, int k) {
        int pointer = low;
        // if the current element less than high, move the position of pointer;
        for (int i = low; i < high; i++) {
            if (nums[i] <= nums[high]) {
                swap(nums, pointer, i);
                pointer++;
            }
        }
        // if the current element bigger than high, swap the pointer and high;
        swap(nums, pointer, high);
        int count = high - pointer + 1;
        if (count == k) {
            return nums[pointer];
        }
        if (count > k) {
            return quickSelect(nums, pointer + 1, high, k);
        }
        return quickSelect(nums, low, pointer - 1, k - count);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end
