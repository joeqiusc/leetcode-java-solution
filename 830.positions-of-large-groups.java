import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=830 lang=java
 *
 * [830] Positions of Large Groups
 */

// @lc code=start
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        if (s == null || s.length() == 0)
            return list;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                int start = i;
                while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                    i++;
                }
                if (i - start >= 2) {
                    list.add(Arrays.asList(new Integer[] { start, i }));
                }
            }
        }
        return list;
    }
}
// @lc code=end
