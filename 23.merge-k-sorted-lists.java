import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode n1, ListNode n2){
                return n1.val-n2.val;
            }
        });
        pq.addAll(Arrays.asList(lists));
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        while(!pq.isEmpty()){
            ListNode remove = pq.poll();
            node.next = new ListNode(remove.val);
            node = node.next;
            remove = remove.next;
            if(remove != null){
                pq.add(remove);
            }
        }
        return dummy.next;
    }
}
// @lc code=end

