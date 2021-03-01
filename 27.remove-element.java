/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i] !=val){
                nums[j] = nums[i];
                j++;
            }
            i++; 
        }
        return j;
    }
}
// @lc code=end

