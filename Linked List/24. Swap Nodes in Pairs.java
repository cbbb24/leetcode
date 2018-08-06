/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        head = head.next;
        ListNode pre = new ListNode(0);
        while(cur != null && cur.next != null){
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            temp.next = cur;
            pre.next = temp;
            pre = cur;
            cur = cur.next;
        }
        return head;
    }
}
