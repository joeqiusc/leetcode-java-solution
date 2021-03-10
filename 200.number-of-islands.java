/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    int row;
    int col;

    public int numIslands(char[][] grid) {
        int result = 0;
        row = grid.length;
        col = grid[0].length;
        if (grid == null || row == 0) {
            return 0;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    DFSConvert(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    private void DFSConvert(char[][] grid, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = 'x';
        DFSConvert(grid, i + 1, j);
        DFSConvert(grid, i - 1, j);
        DFSConvert(grid, i, j + 1);
        DFSConvert(grid, i, j - 1);
    }
}
// @lc code=end
