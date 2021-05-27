import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode id=720 lang=java
 *
 * [720] Longest Word in Dictionary
 */

// @lc code=start
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String res = "";
        for (String s : words) {
            if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
                if (s.length() > res.length())
                    res = s;
                set.add(s);
            }
        }
        return res;
    }
}
// @lc code=end
