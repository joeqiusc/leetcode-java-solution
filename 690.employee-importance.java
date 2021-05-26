import java.util.HashMap;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=690 lang=java
 *
 * [690] Employee Importance
 */

// @lc code=start
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        // solution 1 dsf
        // Map<Integer, Employee> map = new HashMap<>();
        // for (Employee e : employees) {
        // map.put(e.id, e);
        // }
        // return dfs(map, id);
        // }

        // private int dfs(Map<Integer, Employee> map, int id) {
        // Employee e = map.get(id);
        // int sum = e.importance;
        // for (Integer subordinate : e.subordinates) {
        // sum += dfs(map, subordinate);
        // }
        // return sum;

        // solution2 bsf
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }

        Queue<Employee> queue = new LinkedList<>();
        queue.offer(map.get(id));
        int sum = 0;
        while (!queue.isEmpty()) {
            Employee currentE = queue.poll();
            sum += currentE.importance;
            for (Integer subordinate : currentE.subordinates) {
                queue.offer(map.get(subordinate));
            }
        }
        return sum;
    }
}
// @lc code=end
