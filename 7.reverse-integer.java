/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] result Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        long rev = 0, remainder = 0;
        long number = x;

        while (number != 0) {
            remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }
        if (rev >= Integer.MAX_VALUE || rev <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE)
            return 0;
        else
            return (int) rev;

    }
}
// @lc code=end
