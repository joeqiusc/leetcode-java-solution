import java.util.Map;

/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return c;
            }
        }
        return '0';
    }
}
// @lc code=end
