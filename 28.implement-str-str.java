/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        // the java method directlly return it
        //  return haystack.indexOf(needle);
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len2 == 0)
        return 0; 
        if(len1<len2)
        return -1; 
        int result = -1;
        for(int i=0; i<len1; i++){
            int flag = 0;
            if(haystack.charAt(i) == needle.charAt(0)){
                int temp = i;
                int count = 0;
                while(temp<len1 && count<len2){
                    if(haystack.charAt(temp) != needle.charAt(count)){
                        flag = 1;
                        break;
                    }
                    temp++;
                    count++;
                }
                if(flag == 0 && count == len2){
                    result = i;
                    break;
                }
            }
        } 
        return result;
    }
}
// @lc code=end

