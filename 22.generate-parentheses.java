import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", 0, 0, n);
        return result;
    }
    private void dfs(List<String> result, String s, int left, int right, int max){
        if(s.length()==max*2){
            result.add(s);
            return;
        }
        if(left < max){
            dfs(result, s + "(", left+1, right, max);
        }
        if(right < left){
            dfs(result, s + ")", left, right+1, max);
        }
    }
}
// @lc code=end

