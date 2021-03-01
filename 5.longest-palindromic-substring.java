/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
     if(s==null || s.length()==1)
     return s;
     String result = s.substring(0, 1);
     for(int i=0; i<s.length(); i++){
        String temp = helper(s, i, i);
        if(temp.length()>result.length()){
            result = temp;
        }
        temp = helper(s, i, i+1);
        if(temp.length()>result.length()){
            result = temp;
        }
     }
     return result;
    }
    private String helper(String s, int left, int right){
        while(left>=0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}
// @lc code=end

