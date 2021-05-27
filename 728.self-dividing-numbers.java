import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=728 lang=java
 *
 * [728] Self Dividing Numbers
 */

// @lc code=start
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivide(i))
                res.add(i);
        }
        return res;
    }

    private boolean isSelfDivide(int num) {
        int n = num;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0 || num % rem != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
// @lc code=end
