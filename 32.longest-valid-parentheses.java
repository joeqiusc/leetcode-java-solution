import java.util.Stack;

/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

// @lc code=start
class Solution {
    public int longestValidParentheses(String s) {
        // int result = 0;
        // Stack<Integer> stack = new Stack<>();
        // stack.push(-1);
        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i) =='('){
        //         stack.push(i);
        //     }else{
        //         stack.pop();
        //         if(stack.empty()){
        //             stack.push(i);
        //         }else{
        //             result = Math.max(result, i-stack.peek());
        //         }
        //     }
        // }
        // return result;
        int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return maxlength;
    }
}
// @lc code=end

