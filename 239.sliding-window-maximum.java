import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k > nums.length)
            return new int[0];
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            // when the element is out of the widndow, remove it.
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.poll();
            }
            // remove the elements that are less than current element
            // make sure the max element always in the first place.
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.removeLast();
            }
            dq.offer(i);
            // when the elements in the window are k, we keep add the max to the result
            if (i + 1 >= k) {
                result[i - k + 1] = nums[dq.peek()];
            }
        }
        return result;
    }
}
// @lc code=end
