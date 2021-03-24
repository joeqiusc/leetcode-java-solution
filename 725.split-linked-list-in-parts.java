/*
 * @lc app=leetcode id=725 lang=java
 *
 * [725] Split Linked List in Parts
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode current = root;
        int len = 0;
        while (current != null) {
            current = current.next;
            len++;
        }
        int size = len / k;
        int extra = len % k;
        ListNode[] result = new ListNode[k];
        current = root;
        for (int i = 0; i < k; i++) {
            ListNode head = current;
            for (int j = 0; j < size + (i < extra ? 1 : 0) - 1; j++) {
                if (current != null) {
                    current = current.next;
                }
            }
            // set up each split
            if (current != null) {
                ListNode pre = current;
                current = current.next;
                pre.next = null;
            }
            result[i] = head;
        }
        return result;
    }
}
// @lc code=end
