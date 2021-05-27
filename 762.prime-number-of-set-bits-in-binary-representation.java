/*
 * @lc app=leetcode id=762 lang=java
 *
 * [762] Prime Number of Set Bits in Binary Representation
 */

// @lc code=start
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime(countOnes(i)))
                res++;
        }
        return res;
    }

    private boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i <= (int) (Math.sqrt(num)); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            count += (num & 1);
            num >>= 1;
        }
        return count;
    }
}
// @lc code=end
