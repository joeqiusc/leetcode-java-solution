/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if (r * c != n * m || r == n)
            return mat;
        int[][] res = new int[r][c];

        AtomicInteger ai = new AtomicInteger();
        Arrays.stream(mat).flatMapToInt(Arrays::stream).forEach(x -> res[ai.get() / c][ai.getAndIncrement() % c] = x);
        return res;
    }
}
// @lc code=end
