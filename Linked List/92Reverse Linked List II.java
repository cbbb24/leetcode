/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode x1 = tmp, y1 = null;
        for(int i = 0; i < m; i++){
            y1 = x1;
            x1 = x1.next;
        }
        ListNode x2 = x1, y2 = y1;
        ListNode z = null;
        for(int i = 0; i <= n - m; i++){
            z = x2.next;
            x2.next = y2;
            y2 = x2;
            x2 = z;
        }
        y1.next = y2;
        x1.next = x2;
        return tmp.next;
    }
}
