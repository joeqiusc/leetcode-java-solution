/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        if (num == 0)
            return num + "";
        char[] hexs = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            // handle the negative number by 16+num%16 otherwidey if it is negative it will
            // causes out or boundar
            sb.insert(0, hexs[(16 + num % 16) % 16]);
            // >>> instead of /16 can handle the negative
            num = num >>> 4;
        }
        return sb.toString();
    }
}
// @lc code=end
