/*
 * @lc app=leetcode id=812 lang=java
 *
 * [812] Largest Triangle Area
 */

// @lc code=start
class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = 0;
        for (int[] A : points) {
            for (int[] B : points) {
                for (int[] C : points) {
                    area = Math.max(area, 0.5 * calculateArea(A, B, C));
                }
            }
        }
        return area;
    }

    private double calculateArea(int[] A, int[] B, int[] C) {
        int ABx = B[0] - A[0];
        int ABy = B[1] - A[1];
        int ACx = C[0] - A[0];
        int ACy = C[1] - A[1];
        return Math.abs(ABx * ACy - ABy * ACx);
    }
}
// @lc code=end
