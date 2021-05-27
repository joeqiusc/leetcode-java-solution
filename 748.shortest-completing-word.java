/*
 * @lc app=leetcode id=748 lang=java
 *
 * [748] Shortest Completing Word
 */

// @lc code=start
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isAlphabetic(licensePlate.charAt(i))) {
                sb.append(licensePlate.charAt(i));
            }
        }
        String str = sb.toString().toLowerCase();
        String res = "";
        for (String s : words) {
            if ((res.isEmpty() || res.length() > s.length()) && isCompleting(str, s))
                res = s;
        }
        return res;
    }

    private boolean isCompleting(String s1, String s2) {
        int[] arr = new int[26];
        for (char c : s2.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : s1.toCharArray()) {
            if (arr[c - 'a'] == 0)
                return false;
            arr[c - 'a']--;
        }
        return true;
    }
}
// @lc code=end
