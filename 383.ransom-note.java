import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine == null || ransomNote == null)
            return false;
        Map<Character, Integer> ran = new HashMap<>();
        Map<Character, Integer> mag = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            ran.put(c, ran.getOrDefault(c, 0) + 1);
        }
        for (char c : magazine.toCharArray()) {
            mag.put(c, mag.getOrDefault(c, 0) + 1);
        }
        for (char c : ran.keySet()) {
            if (!mag.containsKey(c)) {
                return false;
            }
            if (mag.get(c) < ran.get(c)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
