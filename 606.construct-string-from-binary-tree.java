/*
 * @lc app=leetcode id=606 lang=java
 *
 * [606] Construct String from Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        dfs(sb, t);
        return sb.toString();
    }
    private void dfs(StringBuilder sb, TreeNode n){
        if(n==null) return;
        sb.append(n.val);
        if(n.right != null){
            dfs(sb.append("("), n.left);
            sb.append(")");
            dfs(sb.append("("), n.right);
            sb.append(")");
        } else if(n.left !=null){
            dfs(sb.append("("), n.left);
            sb.append(")");
        }
    }
}
// @lc code=end

