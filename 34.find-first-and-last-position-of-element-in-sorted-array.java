/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = -1;
        result[1] = -1;
        binarySearch(nums, 0, nums.length-1, target, result);
        return result;
    }
    private void binarySearch(int[] nums, int left, int right, int target, int[] result){
        if(left<=right){
            int mid = left + (right-left)/2;
            if(nums[left]==nums[right] && nums[left]==target){
                result[0] = left;
                result[1] = right;
            }
            if(nums[mid]==target){
                result[0] = mid;
                result[1] =mid;
                int n1 = mid; 
                while(n1>left && nums[n1] == nums[n1-1]){
                    n1--;
                    result[0] = n1;
                }
                int n2 = mid;
                while(n2<right && nums[n2]==nums[n2+1]){
                    n2++;
                    result[1] = n2;
                }
            }else if(nums[mid]>target){
                binarySearch(nums, left, mid-1, target, result);
            }else{
                binarySearch(nums, mid+1, right, target, result);
            }       
        }
        return;
    }
}
// @lc code=end

