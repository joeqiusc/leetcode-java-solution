import javax.lang.model.util.ElementScanner6;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int nums[] = new int[s.length()];
        for(int i=0; i<nums.length; i++){
            switch(s.charAt(i)){
                case 'M':
                nums[i] = 1000;
                break;
                case 'D':
                nums[i] = 500;
                break;
                case 'C':
                nums[i] = 100;
                break;
                case 'L':
                nums[i] = 50;
                break;
                case 'X':
                nums[i] = 10;
                break;
                case 'V':
                nums[i] = 5;
                break;
                case 'I':
                nums[i] = 1;
                break; 
            }                
            }
            int sum = 0;
            for(int i=0; i<nums.length-1; i++){
                if(nums[i]<nums[i+1]){
                    sum -= nums[i];
                }else{
                    sum += nums[i];
                }  
        }
        return sum + nums[nums.length-1];
    }
}
// @lc code=end
