import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, result);
        return result;
    }
    private void helper(int start, int[] nums, List<List<Integer>> result){
        if(start==nums.length-1){
            List<Integer> current = new ArrayList<>();
            for(int num: nums){
                current.add(num);
            }
            result.add(current);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=start; i<nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            swap(nums, start, i);
            helper(start+1, nums, result);
            swap(nums, start, i);
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

