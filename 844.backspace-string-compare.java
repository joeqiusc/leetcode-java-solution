import java.util.Stack;

/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        // solution I: by stack
        // return stackHelper(s).equals(stackHelper(t));
        // }

        // private String stackHelper(String s) {
        // Stack<Character> stack = new Stack<>();
        // for (char c : s.toCharArray()) {
        // if (c != '#') {
        // stack.push(c);
        // } else if (!stack.isEmpty()) {
        // stack.pop();
        // }
        // }
        // return stack.toString();

        // solution II: StringBuilder

        return sbHelper(s).equals(sbHelper(t));

    }

    private String sbHelper(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
// @lc code=end
