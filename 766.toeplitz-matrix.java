/*
 * @lc app=leetcode id=766 lang=java
 *
 * [766] Toeplitz Matrix
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return true;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1])
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end
