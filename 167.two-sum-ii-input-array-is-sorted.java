import javax.lang.model.util.ElementScanner6;

/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (numbers[start] + numbers[end] != target) {
            if (numbers[start] + numbers[end] > target)
                end--;
            else
                start++;
        }
        // becareful, the requirement return is not 0 based, is 1 based index
        return new int[] { start + 1, end + 1 };
    }
}
// @lc code=end
