import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        if (jewels == null || jewels.length() == 0 || stones == null || stones.length() == 0)
            return res;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : jewels.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : stones.toCharArray()) {
            if (map.containsKey(c))
                res += map.get(c);
        }
        return res;
    }
}
// @lc code=end
