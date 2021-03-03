import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int begin, int end) {
        if (begin > end)
            return null;
        int mid = (begin + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, begin, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
}
// @lc code=end
