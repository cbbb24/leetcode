/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy, end = dummy;
        int len = 0;
        while(end.next != null){
            end = end.next;
            len++;
        }
        k = k % len;
        for(int i = 0; i < len - k; i++){
            start = start.next;
        }
        end.next = dummy.next;
        dummy.next = start.next;
        start.next = null;
        return dummy.next;
        
    }
}
