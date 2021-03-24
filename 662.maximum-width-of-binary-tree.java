/*
 * @lc app=leetcode id=662 lang=java
 *
 * [662] Maximum Width of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        return dfs(root, 0, 1, new ArrayList<Integer>(), new ArrayList<Integer>());
    }

    public int dfs(TreeNode root, int level, int index, List<Integer> start, List<Integer> end) {
        if (root == null)
            return 0;
        if (start.size() == level) {
            start.add(index);
            end.add(index);
        } else
            end.set(level, index);
        int cur = end.get(level) - start.get(level) + 1;
        int left = dfs(root.left, level + 1, 2 * index, start, end);
        int right = dfs(root.right, level + 1, 2 * index + 1, start, end);
        return Math.max(cur, Math.max(left, right));
    }
}
// @lc code=end
