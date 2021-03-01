import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)
        return null;
        Map<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            String current_char_counts = charCounter(word);
            map.computeIfAbsent(current_char_counts, x ->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    private String charCounter(String strs){
        int[] char_counts = new int[26];
        for(char c : strs.toCharArray()){
            char_counts[c - 'a']++;
        }
        return Arrays.toString(char_counts);
    }
}
// @lc code=end

