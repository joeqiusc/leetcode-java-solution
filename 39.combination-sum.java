import java.awt.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> result = new ArrayList<>();
       List<Integer> current = new ArrayList<>();
       findOne(candidates, 0, target, 0, current, result);
       return result;
    }
    
    private void findOne(int[] candidates, int index, int target, int sum,
    List<Integer> current, List<List<Integer>> result){
        if(sum>target){
            return;
        }
        if(sum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = index; i<candidates.length; i++){
            current.add(candidates[i]);
            findOne(candidates, i, target, sum+candidates[i], current, result);
            current.remove(current.size()-1);
        }
    }
}
// @lc code=end

