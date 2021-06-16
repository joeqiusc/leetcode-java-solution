/*
 * @lc app=leetcode id=868 lang=java
 *
 * [868] Binary Gap
 */

// @lc code=start
class Solution {
    public int binaryGap(int n) {
        String binaryStr = Integer.toBinaryString(n);
        int gap = 0;
        int indexOfOne = binaryStr.indexOf('1');
        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == '1') {
                gap = Math.max(gap, i - indexOfOne);
                indexOfOne = i;
            }
        }
        return gap;
    }
}
// @lc code=end
