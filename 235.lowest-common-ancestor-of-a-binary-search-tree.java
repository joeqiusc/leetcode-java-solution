/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // recurcive solution
        // if (root == null)
        // return root;
        // if (root.val > Math.max(p.val, q.val))
        // return lowestCommonAncestor(root.left, p, q);
        // if (root.val < Math.min(p.val, q.val))
        // return lowestCommonAncestor(root.right, p, q);
        // return root;

        // non recurcive solution

        while (root != null) {
            if (root.val > Math.max(p.val, q.val)) {
                root = root.left;
            } else if (root.val < Math.min(p.val, q.val)) {
                root = root.right;
            } else
                break;
        }
        return root;
    }
}
// @lc code=end
