import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=532 lang=java
 *
 * [532] K-diff Pairs in an Array
 */

// @lc code=start
class Solution {
    public int findPairs(int[] nums, int k) {
        int result = 0;
        if (nums == null || nums.length < 2 || k < 0)
            return result;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int key : map.keySet()) {
            // if k=0 that means the two numbers in the pair are equal, so we need to make
            // sure thre are two identical numbers in the nums
            if (k == 0) {
                if (map.get(key) > 1) {
                    result++;
                }
            } else if (map.containsKey(key + k)) {
                result++;
            }
        }
        return result;
    }
}
// @lc code=end
