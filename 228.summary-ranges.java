import java.util.ArrayList;

/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                if (list.size() == 1) {
                    result.add(list.get(0) + "");
                } else {
                    result.add(list.get(0) + "->" + list.get(list.size() - 1));
                }
                list = new ArrayList<>();
            }
        }
        return result;
    }
}
// @lc code=end
