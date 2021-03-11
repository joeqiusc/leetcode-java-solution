/*
 * @lc app=leetcode id=297 lang=java
 *
 * [297] Serialize and Deserialize Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Codec {
    // build the TreeNode by array
    // String x = "x";
    // int index = 0;

    // // Encodes a tree to a single string.
    // public String serialize(TreeNode root) {
    // if (root == null) {
    // return x;
    // }
    // String left = serialize(root.left);
    // String right = serialize(root.right);
    // return root.val + "," + left + "," + right;
    // }

    // // Decodes your encoded data to tree.
    // public TreeNode deserialize(String data) {
    // String[] array = data.split(",");
    // return dfs(array);
    // }

    // private TreeNode dfs(String[] array) {
    // if (array[index].equals(x)) {
    // index++;
    // return null;
    // }
    // TreeNode root = new TreeNode(Integer.valueOf(array[index++]));
    // root.left = dfs(array);
    // root.right = dfs(array);
    // return root;
    // }

    // build the TreeNode by Deque
    private final String N = "Null";
    private final String Spliter = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(N).append(Spliter);
        } else {
            sb.append(root.val).append(Spliter);
            buildString(root.left, sb);
            buildString(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(Spliter)));
        return buildTree(nodes);
    }

    private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(N))
            return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end
