/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bill5 = 0;
        int bill10 = 0;
        if (bills.length == 0)
            return true;
        if (bills[0] != 5)
            return false;
        for (int m : bills) {
            if (m == 5) {
                bill5++;
            } else if (m == 10) {
                bill5--;
                bill10++;
            } else {
                if (bill10 > 0 && bill5 > 0) {
                    bill10--;
                    bill5--;
                } else if (bill10 == 0 && bill5 >= 3) {
                    bill5 -= 3;
                } else
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end
