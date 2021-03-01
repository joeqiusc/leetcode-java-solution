/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodIndex = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(i+nums[i]>=lastGoodIndex){
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0;
    }
}
// @lc code=end

