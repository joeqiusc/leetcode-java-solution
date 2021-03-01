/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
     int index = nums.length-2;
     while(index>=0 && nums[index]>=nums[index+1]){
         index--;
     }
     if(index>=0){
         int right = nums.length-1;
         while(right>=0 && nums[right]<=nums[index]){
             right--;
         }
         swap(nums, index, right);
     } 
     reverse(nums, index + 1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] =temp;
    }
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
// @lc code=end

