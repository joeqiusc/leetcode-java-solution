/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int n : nums) {
            if (!set.add(n))
                set.remove(n);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}
// @lc code=end
