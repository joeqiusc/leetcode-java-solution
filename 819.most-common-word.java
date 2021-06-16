import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * @lc app=leetcode id=819 lang=java
 *
 * [819] Most Common Word
 */

// @lc code=start
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph == null || paragraph.length() == 0)
            return paragraph;
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        String[] words = paragraph.replaceAll("[!?',;.]", " ").toLowerCase().split("\\s+");
        // String[] words = paragraph.replaceAll("[^A-Za-z]"," ").toLowerCase().split("
        // ");
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        String result = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                result = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return result;
    }
}
// @lc code=end
