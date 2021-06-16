/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // solution I search the max element directly
        // int i = 0;
        // while (arr[i] < arr[i + 1]) {
        // i++;
        // }
        // return i;

        // solution II, binary search

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((arr[mid] > arr[mid + 1]) && (arr[mid] > arr[mid - 1]))
                return mid;

            else if ((arr[mid] > arr[mid + 1]) && (arr[mid] < arr[mid - 1]))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
// @lc code=end
