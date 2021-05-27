/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (newColor != oldColor) {
            dfs(image, sr, sc, newColor, oldColor);
        }
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int newColor, int oldColor) {
        if (sr < 0 || sr > image.length - 1 || sc < 0 || sc > image[sr].length - 1 || image[sr][sc] != oldColor)
            return;
        image[sr][sc] = newColor;
        dfs(image, sr - 1, sc, newColor, oldColor);
        dfs(image, sr + 1, sc, newColor, oldColor);
        dfs(image, sr, sc - 1, newColor, oldColor);
        dfs(image, sr, sc + 1, newColor, oldColor);
    }
}
// @lc code=end
