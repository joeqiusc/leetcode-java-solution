/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

// @lc code=start
class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for (int h = 0; h < 12; h++)
            for (int m = 0; m < 60; m++)
                if (Integer.bitCount(h) + Integer.bitCount(m) == num)
                    res.add(String.format("%d:%02d", h, m));
        return res;
    }
}
// @lc code=end
