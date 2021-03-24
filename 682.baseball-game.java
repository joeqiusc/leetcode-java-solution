/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            switch (op) {
            case "+":
                int pre = stack.pop();
                int prepre = stack.peek();
                stack.push(pre);
                stack.push(pre + prepre);
                break;
            case "D":
                stack.push(stack.peek() * 2);
                break;
            case "C":
                stack.pop();
                break;
            default:
                stack.push(Integer.valueOf(op));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
// @lc code=end
