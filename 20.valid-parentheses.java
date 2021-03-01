import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char current = s.charAt(i);
            if(map.containsKey(current)){
                stack.push(current);
            }else if(!stack.empty() && map.get(stack.peek())==current){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.empty();
    }
}
// @lc code=end

