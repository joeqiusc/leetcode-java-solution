import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if(n<4)
        return result;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j=i+1; j<n; j++ ){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int twoSum = target-nums[i]-nums[j];
                int l = j+1;
                int m = n-1;
                while(l<m){
                    int sum = nums[l] + nums[m];
                    if(sum==twoSum){
                        List<Integer> findOne = new ArrayList<>();
                        findOne.add(nums[i]);
                        findOne.add(nums[j]);
                        findOne.add(nums[l]);
                        findOne.add(nums[m]);
                        result.add(findOne);
                        while(l<m && nums[l+1] == nums[l]) l++;
                        while(l<m && nums[m-1] == nums[m]) m--;
                        l++; m--;
                    }else if(sum<twoSum){
                        l++;
                    }else{
                        m--;
                    }
                }
            }
        }
        return result;
    }
}
// @lc code=end

