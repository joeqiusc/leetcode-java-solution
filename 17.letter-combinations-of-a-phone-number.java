import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length()==0)
        return result;
        Map <Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        char [] array = new char[digits.length()];
        dfs(digits, 0, map, result, array);
        return result;
    }
    private void dfs(String digits, int index, Map <Character, char[]> map, List<String> result, char[] array){
        if(index == digits.length()){
            result.add(new String(array));
            return;
        }
        char number = digits.charAt(index);
        char[] candidate = map.get(number);
        for(int i=0; i<candidate.length; i++){
            array[index] = candidate[i];
            dfs(digits, index+1, map, result, array);
        }
    }
}
// @lc code=end

