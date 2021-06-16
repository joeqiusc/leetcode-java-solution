/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        invertImage(image);
        flipImage(image);
        return image;
    }

    private void invertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = image[i][j] == 1 ? 0 : 1;
            }
        }
    }

    private void flipImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = temp;
            }
        }
    }
}
// @lc code=end
