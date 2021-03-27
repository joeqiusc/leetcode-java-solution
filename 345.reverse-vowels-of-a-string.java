import java.util.HashSet;

/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int start = 0;
        int end = s.length() - 1;
        char[] array = s.toCharArray();
        while (start < end) {
            if (!set.contains(array[start])) {
                start++;
                continue;
            }
            if (!set.contains(array[end])) {
                end--;
                continue;
            }
            char temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
        return new String(array);

        // method 2 using the String to hold the vowels
        // if(s == null || s.length()==0) return s;
        // String vowels = "aeiouAEIOU";
        // char[] chars = s.toCharArray();
        // int start = 0;
        // int end = s.length()-1;
        // while(start<end){
        // +"" is to transform the char to string
        // while(start<end && !vowels.contains(chars[start]+"")){
        // start++;
        // }

        // while(start<end && !vowels.contains(chars[end]+"")){
        // end--;
        // }

        // char temp = chars[start];
        // chars[start++] = chars[end];
        // chars[end--] = temp;
        // }
        // return new String(chars);
    }
}
// @lc code=end
