/*
 * @lc app=leetcode id=744 lang=java
 *
 * [744] Find Smallest Letter Greater Than Target
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int index = 0; index < letters.length; index++)
            if (letters[index] > target)
                return letters[index];

        return letters[0];
    }
}
// @lc code=end
