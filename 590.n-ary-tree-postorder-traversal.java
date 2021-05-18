import java.util.ArrayList;

/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        helper(root);
        return result;
    }

    private void helper(Node root) {
        if (root == null)
            return;
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i));
        }
        result.add(root.val);
    }
}
// @lc code=end
