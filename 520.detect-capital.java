/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int caps = 0;
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) - 'A' < 26) {
                caps++;
            }
        }
        if (caps == n) {
            return true;
        } else if (caps == 1 && word.charAt(0) - 'A' < 26) {
            return true;
        } else if (caps == 0) {
            return true;
        } else {
            return false;
        }
    }
}
// @lc code=end
