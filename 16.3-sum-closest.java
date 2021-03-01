import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int tempSum = nums[i] + nums[j] + nums[k];
                if(sum == Integer.MAX_VALUE || Math.abs(sum -target)>Math.abs(tempSum-target)){
                    sum = tempSum;
                }
                if (tempSum>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return sum;
    }
}
// @lc code=end

