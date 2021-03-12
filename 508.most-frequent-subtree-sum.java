/*
 * @lc app=leetcode id=508 lang=java
 *
 * [508] Most Frequent Subtree Sum
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    int max = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null)
            return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, map);
        List<Integer> res = new LinkedList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == max)
                res.add(e.getKey());
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    private int helper(TreeNode n, Map<Integer, Integer> map) {
        int left = (n.left == null) ? 0 : helper(n.left, map);
        int right = (n.right == null) ? 0 : helper(n.right, map);
        int sum = left + right + n.val;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        max = Math.max(max, map.get(sum));
        return sum;

    }
}
// @lc code=end
