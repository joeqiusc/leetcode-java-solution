/*
 * @lc app=leetcode id=661 lang=java
 *
 * [661] Image Smoother
 */

// @lc code=start
class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] results = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int num = 0;
                int sum = 0;
                for (int m = i - 1; m <= i + 1; m++) {
                    for (int n = j - 1; n <= j + 1; n++) {
                        if (m >= 0 && n >= 0 && m < M.length && n < M[0].length) {
                            num++;
                            sum += M[m][n];
                        }
                    }
                }
                results[i][j] = sum / num;
            }
        }
        return results;
    }
}
// @lc code=end
