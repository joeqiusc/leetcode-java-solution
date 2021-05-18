import java.util.HashSet;

/*
 * @lc app=leetcode id=575 lang=java
 *
 * [575] Distribute Candies
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candyType) {
        int half = candyType.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        return half > set.size() ? set.size() : half;
    }
}
// @lc code=end
