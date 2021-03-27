import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || pattern.length() == 0 || s == null || s.length() == 0)
            return false;
        String[] strArr = s.split(" ");
        if (pattern.length() != strArr.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            char c = pattern.charAt(i);
            String str = strArr[i];
            if (!map.containsKey(c)) {
                if (map.containsValue(str)) {
                    return false;
                }
                map.put(c, str);
            } else if (!map.get(c).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
