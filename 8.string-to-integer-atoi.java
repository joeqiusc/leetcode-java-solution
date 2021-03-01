/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        if(s==null || s.trim().length()==0)
        return 0;
        long result = 0;
        int sign = 1;
        s = s.trim();
        int i = 0;
        if(s.charAt(0) == '-'){
            sign = -1;
            i++;
        }else if (s.charAt(0) =='+'){
            sign = 1;
            i++;
        }else{
            sign = 1;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            result = result*10 + Character.getNumericValue(s.charAt(i));
            i++;
            if ((sign == 1 && result > Integer.MAX_VALUE) || (-result < Integer.MIN_VALUE)) {
                return getOverflowValue(sign);
            }
        }
        return sign*(int)result;
    }

    private int getOverflowValue(int sign) {
        return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    }
}
// @lc code=end

