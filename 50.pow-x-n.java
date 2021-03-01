/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        double half=myPow(x,n/2);
        if(n%2==0) return half*half;
        else if(n>0) return half*half*x;
        else return half*half/x;
    }
}
// @lc code=end

