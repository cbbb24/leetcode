/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode start = tmp, end = tmp;
        for(int i = 1; i <= n; i++){
            end = end.next;
        }
        while(end.next != null){
            start = start.next;
            end = end.next;
        }
        start.next = start.next.next;
        return tmp.next;
        
        
    }
}
