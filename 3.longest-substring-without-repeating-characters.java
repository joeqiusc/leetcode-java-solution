import java.util.HashSet;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
     
        HashSet<Character> set = new HashSet<>();
        int result = 1;
        int i=0; 
        for(int j=0; j<s.length(); j++){
            char c = s.charAt(j);
            if(set.add(c)){
                set.add(c);
                result = Math.max(result, set.size());
            }else{
                while(i<j){
                    if(s.charAt(i)==c){
                        i++;
                        break;
                    }
                    set.remove(s.charAt(i));
                    i++;
                }
            }    
        }
     
        return result;
    }
}
// @lc code=end

