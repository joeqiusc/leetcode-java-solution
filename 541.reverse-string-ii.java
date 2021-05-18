/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        // StringBuilder sb = new StringBuilder();

        // int i = 0, j = 0;
        // while (i < s.length()) {
        // // first k
        // j = i + k <= s.length() ? i + k : s.length();
        // sb.append((new StringBuilder(s.substring(i, j))).reverse().toString());

        // if (j >= s.length())
        // break;

        // // second k
        // i = j;
        // j = i + k <= s.length() ? i + k : s.length();
        // sb.append(s.substring(i, j));

        // i = j;
        // }

        // return sb.toString();

        if (k == 1) {
            return s;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            int start = i;
            int end = Math.min(start + k - 1, arr.length - 1);
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);

    }
}
// @lc code=end
