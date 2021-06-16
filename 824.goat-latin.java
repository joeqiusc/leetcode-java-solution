import java.util.HashSet;

/*
 * @lc app=leetcode id=824 lang=java
 *
 * [824] Goat Latin
 */

// @lc code=start
class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            set.add(c);
        }
        StringBuilder end = new StringBuilder("a");
        for (String word : words) {
            char first = word.charAt(0);
            if (set.contains(first)) {
                sb.append(word);
            } else {
                sb.append(word.substring(1)).append(first);
            }
            sb.append("ma").append(end).append(" ");
            end.append("a");
        }
        // there is an extra space at the end of the sb, before return, need to remove
        // it
        return sb.toString().trim();
    }
}
// @lc code=end
