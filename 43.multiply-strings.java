/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
        return "0";
        int m = num1.length();
        int n = num2.length();
        int[] num = new int[m+n];
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                int x = num1.charAt(i)-'0';
                int y = num2.charAt(j)- '0';
                int sum = x*y + num[(m-1-i)+(n-1-j)];
                num[(m-1-i)+(n-1-j)] = sum % 10;
                num[(m-1-i)+(n-1-j)+1] += sum/10;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<m+n-1; i++){
            result.insert(0, num[i]);
        }
        if(num[m+n-1] !=0){
            result.insert(0, num[m+n-1]);
        }
        return result.toString();
    }
}
// @lc code=end

