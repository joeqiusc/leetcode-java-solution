import java.text.BreakIterator;

/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode dummy_head = l;
        if(l1 == null && l2 == null)
        return null;
        while(l1!=null||l2!=null){
            if(l1==null){
                l.next = l2;
                break;
            }else if(l2==null){
                l.next = l1;
                break;
            }else{
                if(l1.val <l2.val){
                    l.next = l1;
                    l1 = l1.next;
                }else{
                    l.next = l2;
                    l2 = l2.next;
                }
                l = l.next;
            }
        }
        return dummy_head.next;
    }
}
// @lc code=end

