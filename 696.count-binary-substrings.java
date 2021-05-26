/*
 * @lc app=leetcode id=696 lang=java
 *
 * [696] Count Binary Substrings
 */

// @lc code=start
class Solution {
    public int countBinarySubstrings(String s) {
        int currValueCount = 1;
        int prevValueCount = 0;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currValueCount++;
            } else {
                prevValueCount = currValueCount;
                currValueCount = 1;
            }
            if (prevValueCount >= currValueCount) {
                count++;
            }
        }
        return count;
    }
}
// @lc code=end
