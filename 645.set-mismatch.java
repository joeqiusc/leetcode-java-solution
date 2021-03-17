import java.util.HashSet;

/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sumN = n * (n + 1) / 2;
        int sum = 0;
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                result[0] = num;
            } else {
                set.add(num);
                sum += num;
            }
        }
        result[1] = sumN - sum;
        return result;
    }
}
// @lc code=end
