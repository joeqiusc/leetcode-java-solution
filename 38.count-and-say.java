/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if(n<1)
        return null;
        if(n==1)
        return "1";
        StringBuilder result = new StringBuilder("11");
        for(int i=2; i<n; i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=1; j<result.length();j++){
                if(result.charAt(j-1)==result.charAt(j)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count=1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length()-1));
            result = sb;
        }
        return result.toString();
    }
}
// @lc code=end

