import java.util.ArrayList;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsetsHelper(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void subsetsHelper(List<List<Integer>> list, List<Integer> current, int[] nums, int start) {
        list.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            // add element
            current.add(nums[i]);
            // Explore
            subsetsHelper(list, current, nums, i + 1);
            // remove
            current.remove(current.size() - 1);
        }
    }
}
// @lc code=end
