/*
 * @lc app=leetcode id=646 lang=java
 *
 * [646] Maximum Length of Pair Chain
 */

// @lc code=start
class Solution {
    public int findLongestChain(int[][] pairs) {
        // if lambda is hard to understand, you can use the comparator to sort array
        // Arrays.sort(pairs, (p1, p2) -> p1[1] - p2[1]);

        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                return p1[1] - p2[1];
            }
        });

        int count = 0, end = Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            if (pair[0] > end) {
                count++;
                end = pair[1];
            }
        }
        return count;
    }
}
// @lc code=end
