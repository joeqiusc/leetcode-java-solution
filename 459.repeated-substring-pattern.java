/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() < 2)
            return false;
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                int repeat = len / i;
                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < repeat; j++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}
// @lc code=end
