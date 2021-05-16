import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    // using the array to track the last fib;
    // public int fib(int n) {
    // if (n <= 1)
    // return n;
    // int fib[] = new int[n + 1];
    // fib[0] = 0;
    // fib[1] = 1;
    // for (int i = 2; i <= n; i++) {
    // fib[i] = fib[i - 1] + fib[i - 2];
    // }
    // return fib[n];
    // }

    // using the dp;
    public int fib(int n) {
        if (n <= 1)
            return n;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        return fib(n, map);
    }

    private int fib(int n, Map<Integer, Integer> map) {
        if (!map.containsKey(n)) {
            int currentFib = fib(n - 1, map) + fib(n - 2, map);
            map.put(n, currentFib);
        }
        return map.get(n);
    }
}
// @lc code=end
