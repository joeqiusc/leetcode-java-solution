import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows <= 0)
            return list;
        List<Integer> preRow = new ArrayList<>();
        preRow.add(1);
        list.add(preRow);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 0; j < preRow.size() - 1; j++) {
                currentRow.add(preRow.get(j) + preRow.get(j + 1));
            }
            currentRow.add(1);
            list.add(currentRow);
            preRow = currentRow;
        }
        return list;
    }
}
// @lc code=end
