import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int target = - nums[i];
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[j] + nums[k] == target){
                    List<Integer> find = new ArrayList<>();
                    find.add(nums[i]);
                    find.add(nums[j]);
                    find.add(nums[k]);
                    result.add(find);
                    j++;
                    k--;
                    while((j<k) && nums[j-1] == nums[j]){j++;}
                    while((j<k) && nums[k] == nums[k+1]){k--;}
                } else if(nums[j] + nums[k] > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return result;
    }
}
// @lc code=end

