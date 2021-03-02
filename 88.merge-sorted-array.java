/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        m--;
        n--;
        while (i >= 0) {
            if (m < 0) {
                nums1[i] = nums2[n];
                n--;
            } else if (n < 0) {
                nums1[i] = nums1[m];
                m--;
            } else {
                if (nums1[m] > nums2[n]) {
                    nums1[i] = nums1[m];
                    m--;
                } else {
                    nums1[i] = nums2[n];
                    n--;
                }
            }
            i--;
        }
    }
}
// @lc code=end
