import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates==null||candidates.length==0)
        return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        findOne(candidates, 0, target, current, result);
        return result;
    }

    private void findOne(int[] candidates, int index, int remainTarget, 
    List<Integer> current, List<List<Integer>> result){
        if(remainTarget==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=index; i<candidates.length; i++){
            if(candidates[i]>remainTarget)
            return;
            if(i != index && candidates[i-1]==candidates[i]){
                continue;
            }
            current.add(candidates[i]);
            findOne(candidates, i+1, remainTarget-candidates[i], current, result);
            current.remove(current.size()-1);
        }
    }
}
// @lc code=end

