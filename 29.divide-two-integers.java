/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
       int sign = 1;
       if((dividend > 0) ^ (divisor > 0)) {
           sign = -1;
       }
       long Ldividend = Math.abs((long)dividend);
       long Ldivisor = Math.abs((long)divisor);
       long Lresult = Ldivide(Ldividend, Ldivisor, sign);
       if(Lresult>Integer.MAX_VALUE){
           return Integer.MAX_VALUE;
       } else if(Lresult<Integer.MIN_VALUE){
           return Integer.MIN_VALUE;
       }else{
           return (int) Lresult;
       }  
    }
    private long Ldivide(long Ldividend, long Ldivisor, int sign){
        if(Ldividend<Ldivisor){
            return 0;
        }
        long multiple = 1;
        long sum = Ldivisor;
        while(sum + sum < Ldividend){
            multiple += multiple;
            sum += sum;
        }
        if(sign == 1){
            return multiple + Ldivide(Ldividend - sum, Ldivisor, sign);
        }else{
            return 0 - multiple + Ldivide(Ldividend-sum, Ldivisor,sign);
        }
    }
}
// @lc code=end

