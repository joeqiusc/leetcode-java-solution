/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // if (head == null)
        // return null;
        // while (head != null) {
        // if (head.val == val) {
        // head = head.next;
        // } else {
        // break;
        // }
        // }
        // ListNode current = head;
        // if (current == null)
        // return null;
        // while (current.next != null) {
        // if (current.next.val == val) {
        // current.next = current.next.next;
        // } else {
        // current = current.next;
        // }
        // }
        // return head;

        // use the dummy head we don't need to worry about the null situation
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}
// @lc code=end
