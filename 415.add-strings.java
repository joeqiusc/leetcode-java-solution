/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int m = num1.length() - 1;
        int n = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (m >= 0 || n >= 0 || carry > 0) {
            int n1 = 0;
            int n2 = 0;
            if (m >= 0) {
                n1 = num1.charAt(m) - '0';
                m--;
            }
            if (n >= 0) {
                n2 = num2.charAt(n) - '0';
                n--;
            }
            int num = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) / 10;
            sb.append(num);
        }
        return sb.reverse().toString();
    }
}
// @lc code=end
