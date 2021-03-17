/*
 * @lc app=leetcode id=553 lang=java
 *
 * [553] Optimal Division
 */

// @lc code=start
class Solution {
    public String optimalDivision(int[] nums) {
        if(nums==null||nums.length<1) return "";
        StringBuilder sb = new StringBuilder();
        if(nums.length==1) return sb.append(nums[0]).toString();
        if(nums.length==2) return sb.append(nums[0]+ "/" +nums[1]).toString();
        sb.append(nums[0]+ "/("+nums[1]);
        for(int i=2; i<nums.length; i++){
            sb.append("/" + nums[i]);
        }
        sb.append(")");
        return sb.toString();
    }
}
// @lc code=end

