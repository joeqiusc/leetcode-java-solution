/*
 * @lc app=leetcode id=717 lang=java
 *
 * [717] 1-bit and 2-bit Characters
 */

// @lc code=start
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 0)
                i++;
            else
                i += 2;
        }
        return i == bits.length - 1;
    }
}
// @lc code=end
