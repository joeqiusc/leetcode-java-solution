import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=692 lang=java
 *
 * [692] Top K Frequent Words
 */

// @lc code=start
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        if (words == null || words.length == 0)
            return new ArrayList<String>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> candidates = new ArrayList<>(map.keySet());
        Collections.sort(candidates, (word1,
                word2) -> map.get(word1) != map.get(word2) ? map.get(word2) - map.get(word1) : word1.compareTo(word2));
        return candidates.subList(0, k);
    }
}
// @lc code=end
