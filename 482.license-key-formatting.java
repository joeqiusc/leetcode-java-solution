/*
 * @lc app=leetcode id=482 lang=java
 *
 * [482] License Key Formatting
 */

// @lc code=start
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        if (S == null || S.length() == 0)
            return S;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c == '-')
                continue;
            if (count == K) {
                sb.append("-");
                count = 0;
            }
            sb.append(c);
            count++;
        }
        return sb.reverse().toString().toUpperCase();
    }
}
// @lc code=end
