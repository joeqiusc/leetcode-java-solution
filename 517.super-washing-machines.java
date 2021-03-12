/*
 * @lc app=leetcode id=517 lang=java
 *
 * [517] Super Washing Machines
 */

// @lc code=start
class Solution {
    public int findMinMoves(int[] machines) {
        int total = 0;
        for (int i : machines) {
            total += i;
        }
        if (total % machines.length != 0) {
            return -1;
        }
        int avg = total / machines.length;
        int count = 0;
        int max = 0;
        for (int load : machines) {
            count += load - avg; // load-avg is "gain/lose"
            max = Math.max(Math.max(max, Math.abs(count)), load - avg);
        }
        return max;
    }
}
// @lc code=end
