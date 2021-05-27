/*
 * @lc app=leetcode id=788 lang=java
 *
 * [788] Rotated Digits
 */

// @lc code=start
class Solution {
    public int rotatedDigits(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += isGood(i) ? 1 : 0;
        }
        return res;
    }

    private boolean isGood(int n) {
        boolean isValid = false;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3 || rem == 4 || rem == 7)
                return false;
            if (rem == 2 || rem == 5 || rem == 6 || rem == 9)
                isValid = true;
            n /= 10;
        }
        return isValid;
    }
}
// @lc code=end
