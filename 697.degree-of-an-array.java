import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 */

// @lc code=start
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!left.containsKey(nums[i])) {
                left.put(nums[i], i);
            }
            right.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            degree = Math.max(degree, count.get(nums[i]));
        }
        int result = nums.length;
        for (int key : count.keySet()) {
            if (count.get(key) == degree) {
                result = Math.min(result, right.get(key) - left.get(key) + 1);
            }
        }
        return result;
    }
}
// @lc code=end
