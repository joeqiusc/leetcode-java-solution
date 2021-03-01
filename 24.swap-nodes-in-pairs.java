/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null)
        return head;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode dummy = pre;
        while(pre.next != null && pre.next.next != null){
            ListNode a = pre.next;
            ListNode b = a.next;

            a.next = b.next;
            b.next = a;
            pre.next = b;

            pre = pre.next.next;
        }
        return dummy.next;
    }
}
// @lc code=end

