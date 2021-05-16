import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=501 lang=java
 *
 * [501] Find Mode in Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    int curCount = 1;
    int maxCount = 0;
    TreeNode prev;

    public int[] findMode(TreeNode root) {
        if (root == null)
            return new int[0];
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void inOrder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        inOrder(node.left, list);
        if (prev != null) {
            if (node.val == prev.val)
                curCount++;
            else
                curCount = 1;
        }
        prev = new TreeNode(node.val);
        if (curCount > maxCount) {
            maxCount = curCount;
            list.clear();
            list.add(node.val);
        } else if (curCount == maxCount)
            list.add(node.val);
        inOrder(node.right, list);
    }
}
// @lc code=end
