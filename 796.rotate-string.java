import jdk.nashorn.internal.ir.ReturnNode;

/*
 * @lc app=leetcode id=796 lang=java
 *
 * [796] Rotate String
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        // this method need to split the string and then concat them;
        // if (s.length() == 0 && goal.length() == 0)
        // return true;
        // if (s.length() != goal.length())
        // return false;
        // for (int i = 0; i < s.length(); i++) {
        // if ((s.substring(i) + s.substring(0, i)).equals(goal))
        // return true;
        // }
        // return false;

        // If there is only rotate, double the rotate string alway contains the goal
        // string
        if (s.length() == 0 && goal.length() == 0)
            return true;
        if (s.length() != goal.length())
            return false;
        return (s + s).contains(goal);
    }

}
// @lc code=end
