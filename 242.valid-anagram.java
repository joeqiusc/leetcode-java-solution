import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        // Hash map solution
        // if (s == null && t == null)
        // return true;
        // if (s.length() != t.length())
        // return false;
        // Map<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        // char c = s.charAt(i);
        // if (map.containsKey(c)) {
        // map.put(c, map.get(c) + 1);
        // } else {
        // map.put(c, 1);
        // }
        // }
        // for (int i = 0; i < t.length(); i++) {
        // char c = t.charAt(i);
        // if (map.containsKey(c)) {
        // if (map.get(c) == 1) {
        // map.remove(c);
        // } else {
        // map.put(c, map.get(c) - 1);
        // }
        // } else {
        // return false;
        // }
        // }
        // if (map.size() > 0)
        // return false;
        // return true;

        // alphabets solution, we can count each letter's frequence by alphabets array
        if (s == null && t == null)
            return true;
        if (s.length() != t.length())
            return false;
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for (int n : chars) {
            if (n != 0)
                return false;
        }
        return true;
    }
}
// @lc code=end
