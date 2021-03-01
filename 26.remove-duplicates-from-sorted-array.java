/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2)
        return nums.length;
        int j =0;
        int i =1;
        while(i<nums.length){
            if(nums[i] !=nums[j]){
                j++;
                nums[j] = nums[i];
            }
            i++;
        }
        return j+1;
    }
}
// @lc code=end

