/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        int sum = 0;
        if (root.left != null)
            sum += (root.left.left == null && root.left.right == null) ? root.left.val : sumOfLeftLeaves(root.left);
        if (root.right != null)
            sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
// @lc code=end
