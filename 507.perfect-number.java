/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1)
            return false;
        int sqrt = (int) Math.sqrt(num);
        int sum = 1;
        int i = 2;
        while (i <= sqrt) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
            i++;
        }
        if (sum == num)
            return true;

        return false;
    }
}
// @lc code=end
