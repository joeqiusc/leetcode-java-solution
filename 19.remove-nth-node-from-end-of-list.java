/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    // work solution
    //    ListNode dummy_head = new ListNode(0);
    //    dummy_head.next = head;
    //    ListNode farst = dummy_head;
    //    ListNode slow = dummy_head;
    //    for(int i=1; i<=n+1; i++){
    //        farst = farst.next;
    //    }
    //    while(farst !=null){
    //     slow = slow.next;
    //     farst = farst.next;
    //    }
    //    slow.next = slow.next.next;
    //    return dummy_head.next;

    if(head == null)
    return null;
    ListNode farst = head;
    ListNode slow = head;
    for(int i=0; i<n; i++){
        farst = farst.next;
    }
    if(farst==null){
        head = head.next;
        return head;
    }
    while(farst.next !=null){
        farst = farst.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    return head;
    }
}
// @lc code=end

