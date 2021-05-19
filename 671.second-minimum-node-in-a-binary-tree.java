/*
 * @lc app=leetcode id=671 lang=java
 *
 * [671] Second Minimum Node In a Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    // Here must use the long to hold the min/secMin value, otherwise, the max
    // Integer will break the logic

    long min = Long.MAX_VALUE;
    long secMin = Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        return secMin < Long.MAX_VALUE ? (int) secMin : -1;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;
        if (node.val < min) {
            secMin = min;
            min = node.val;
        } else if (node.val < secMin && node.val != min) {
            secMin = node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }
}
// @lc code=end
