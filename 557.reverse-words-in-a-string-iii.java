/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 1)
            return s;
        char[] arr = s.toCharArray();
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            while (end < s.length() && s.charAt(end) != ' ') {
                end++;
            }
            reverse(arr, start, end - 1);
            end++;
            start = end;
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int start, int end) {
        for (int i = 0; i < (end - start + 1) / 2; i++) {
            char temp = arr[start + i];
            arr[start + i] = arr[end - i];
            arr[end - i] = temp;
        }
    }
}
// @lc code=end
