/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        while (high >= low) {
            long mid = low + (high - low) / 2;
            if (mid * mid > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return (int) high;
    }
}
// @lc code=end
