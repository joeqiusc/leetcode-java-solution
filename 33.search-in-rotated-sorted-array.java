/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {   
        return binarySearch(nums, 0, nums.length-1, target);
    }
     
    private int binarySearch(int[] nums, int left, int right, int target){
        if(left>right) 
            return -1;
        int mid = left + (right-left)/2; 
        if(target == nums[mid])
            return mid; 
        if(nums[left] <= nums[mid]){
            if(nums[left]<=target && target<nums[mid]){
              return binarySearch(nums,left, mid-1, target);
            }else{
              return  binarySearch(nums, mid+1, right, target);
            }
        }else {
            if(nums[mid]<target&& target<=nums[right]){
              return  binarySearch(nums,mid+1, right, target);
            }else{
              return  binarySearch(nums, left, mid-1, target);
            }
        }
    }
// retular binarySearch
    // int binarySearch(int arr[], int l, int r, int x) 
    // { 
    //     if (r >= l) { 
    //         int mid = l + (r - l) / 2; 
    //         if (arr[mid] == x) 
    //             return mid; 
    //         if (arr[mid] > x) 
    //             return binarySearch(arr, l, mid - 1, x); 
    //         return binarySearch(arr, mid + 1, r, x); 
    //     } 
    //     return -1; 
    // }
}
// @lc code=end

