/*
 * @lc app=leetcode id=396 lang=java
 *
 * [396] Rotate Function
 */

// @lc code=start
class Solution {
    public int maxRotateFunction(int[] A) {
        // This question is a math question
        // F(0) = 0A + 1B + 2C +3D
        // F(1) = 0D + 1A + 2B +3C
        // F(2) = 0C + 1D + 2A +3B
        // F(3) = 0B + 1C + 2D +3A

        // sum = 1A + 1B + 1C + 1D
        // F(1) = F(0) + sum - 4D
        // F(2) = F(1) + sum - 4C
        // F(3) = F(2) + sum - 4B

        // --> F(i) = F(i-1) + sum - n*A[n-i]

        int temp = 0, sum = 0, n = A.length;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            temp += i * A[i];
        }
        int result = temp;
        for (int i = 1; i < n; i++) {
            temp = temp + sum - n * A[n - i];
            result = Math.max(temp, result);
        }
        return result;
    }
}
// @lc code=end
