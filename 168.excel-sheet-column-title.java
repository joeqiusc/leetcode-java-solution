/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (--n >= 0) {
            sb.insert(0, (char) (n % 26 + 'A'));
            n = n / 26;
        }

        return sb.toString();
    }
}
// @lc code=end
