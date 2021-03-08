import java.util.HashMap;

/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return head;
        Node dummy = new Node(0);
        Node curr = dummy;
        Map<Node, Node> map = new HashMap<>();
        while (head != null) {
            if (!map.containsKey(head)) {
                map.put(head, new Node(head.val));
            }
            curr.next = map.get(head);
            if (head.random != null) {
                if (!map.containsKey(head.random)) {
                    map.put(head.random, new Node(head.random.val));
                }
                curr.next.random = map.get(head.random);
            }
            curr = curr.next;
            head = head.next;
        }
        return dummy.next;
    }
}
// @lc code=end
