import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    // dfs method
    // public List<String> binaryTreePaths(TreeNode root) {
    // List<String> result = new ArrayList<>();
    // if (root == null)
    // return result;
    // List<String> list = new ArrayList<>();
    // dfs(root, list, result);
    // return result;
    // }

    // private void dfs(TreeNode node, List<String> list, List<String> result) {
    // list.add(node.val + "");
    // if (node.left == null && node.right == null) {
    // String str = "";
    // for (String s : list) {
    // str += s + "->";
    // }
    // result.add(str.substring(0, str.length() - 2));
    // return;
    // }
    // if (node.left != null) {
    // dfs(node.left, list, result);
    // list.remove(list.size() - 1);
    // }
    // if (node.right != null) {
    // dfs(node.right, list, result);
    // list.remove(list.size() - 1);
    // }
    // }

    // stack method
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<TreeNode> st = new Stack<>();
        Stack<String> ss = new Stack<>();
        st.push(root);
        ss.push("" + root.val);
        while (!st.isEmpty()) {
            TreeNode current = st.pop();
            String currentPath = ss.pop();
            if (current.left == null && current.right == null) {
                result.add(currentPath);
            } else {
                if (current.left != null) {
                    st.push(current.left);
                    ss.push(currentPath + "->" + current.left.val);
                }
                if (current.right != null) {
                    st.push(current.right);
                    ss.push(currentPath + "->" + current.right.val);
                }
            }
        }
        return result;
    }
}
// @lc code=end
