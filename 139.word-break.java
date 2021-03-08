import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    Set<String> wordSet;
    Map<String, Boolean> map = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        wordSet = new HashSet<>(wordDict);
        return helper(s);
    }

    private boolean helper(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (map.containsKey(s)) {
            return map.get(s);
        }
        int n = s.length();
        for (int i = 1; i <= n; i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            if (wordSet.contains(left) && helper(right)) {
                map.put(s, true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }
}
// @lc code=end
