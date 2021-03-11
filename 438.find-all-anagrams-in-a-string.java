import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return list;
        }
        int[] dict_p = new int[26];
        int[] dict_s = new int[26];
        for (int i = 0; i < p.length(); i++) {
            dict_p[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            dict_s[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            // compare the i=0, the first window
            if (isSame(dict_p, dict_s)) {
                list.add(i);
            }
            // sliding the window
            dict_s[s.charAt(i + p.length()) - 'a']++;
            dict_s[s.charAt(i) - 'a']--;
        }
        if (isSame(dict_p, dict_s)) {
            list.add(s.length() - p.length());
        }
        return list;
    }

    private boolean isSame(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
