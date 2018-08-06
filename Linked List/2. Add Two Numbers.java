/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode cur = head;
        int carry = 0;
        while(p != null || q != null){
            int x = (p == null) ? 0 : p.val;
            int y = (q == null) ? 0 : q.val;
            int sum = carry + x + y;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum / 10;
            p = (p == null) ? p : p.next;
            q = (q == null) ? q : q.next;            
        }
        if(carry != 0){
            cur.next = new ListNode(carry);
        }
        return head.next;
    }
}
