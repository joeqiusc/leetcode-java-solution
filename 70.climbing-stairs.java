/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n - 1];
    }
}
// @lc code=end
