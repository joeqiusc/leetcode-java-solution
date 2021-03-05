import java.util.HashSet;

/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // this one not efficient
        // if (head == null)
        // return false;
        // ListNode dummy = new ListNode();
        // dummy.next = head;
        // head = head.next;
        // Set<ListNode> set = new HashSet<>();
        // while (head != null) {
        // if (!set.add(head)) {
        // return true;
        // }
        // set.add(head);
        // head = head.next;
        // }
        // return false;
        // }

        if (head == null || head.next == null)
            return false;
        if (head.next == head)
            return true;
        ListNode nextNode = head.next;
        head.next = head;
        boolean isCycle = hasCycle(nextNode);
        return isCycle;
    }

}
// @lc code=end
