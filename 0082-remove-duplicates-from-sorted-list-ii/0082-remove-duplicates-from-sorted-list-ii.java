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
    public ListNode deleteDuplicates(ListNode head) {
        int[] count = new int[201];

        
        ListNode curr = head;
        while (curr != null) {
            count[curr.val + 100]++;
            curr = curr.next;
        }

        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        curr = head;
        while (curr != null) {
            if (count[curr.val + 100] == 1) {
                tail.next = curr;
                tail = tail.next;
            }
            curr = curr.next;
        }
        tail.next = null; 

        return dummy.next;
    }
}