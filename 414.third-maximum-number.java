/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        long third = Long.MIN_VALUE, second = third, first = third;
        for (int n : nums) {
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second && n < first) {
                third = second;
                second = n;
                // this is necessary, if there is only two elements in the nums, that means the
                // third max number doesn't exist at all, so the third is default
                // value,Long.MIN_VALUE
            } else if (n > third && n < second) {
                third = n;
            }
        }
        return (int) (third != Long.MIN_VALUE ? third : first);
    }
}
// @lc code=end
