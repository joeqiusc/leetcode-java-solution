/*
 * @lc app=leetcode id=640 lang=java
 *
 * [640] Solve the Equation
 */

// @lc code=start
class Solution {
    public String solveEquation(String equation) {
        if (equation == null || equation.length() < 3)
            return "No solution";
        String left = equation.substring(0, equation.indexOf("="));
        String right = equation.substring(equation.indexOf("=") + 1);
        int[] ls = getCounts(left);
        int[] rs = getCounts(right);
        int countX = ls[0] - rs[0];
        int countNum = rs[1] - ls[1];
        if (countX == 0) {
            if (countNum == 0)
                return "Infinite solutions";
            else
                return "No solution";
        }

        int x = countNum / countX;
        StringBuilder sb = new StringBuilder();
        sb.append("x=").append(x);
        return sb.toString();
    }

    private int[] getCounts(String str) {
        int[] res = new int[2];
        // the regular expression is the key for this question
        String[] parts = str.split("(?=[+-])");
        for (String part : parts) {
            if (part.equals("x") || part.equals("+x"))
                res[0]++;
            else if (part.equals("-x"))
                res[0]--;
            else if (part.contains("x"))
                res[0] += Integer.valueOf(part.substring(0, part.indexOf("x")));
            else
                res[1] += Integer.valueOf(part);
        }
        return res;
    }
}
// @lc code=end
