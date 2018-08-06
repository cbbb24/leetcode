/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur1 = head, cur2 = slow.next;
        slow.next = null;
        ListNode pre = null, temp = cur2.next;
        while(cur2 != null){
            cur2.next = pre;
            pre = cur2;
            cur2 = temp;
            if(cur2 == null) break;
            temp = temp.next;
        }
        ListNode temp1 = cur1.next, temp2 = pre.next;
        while(cur1 != null){
            cur1.next = pre;
            cur1 = temp1;
            pre.next = temp1;
            pre = temp2;
            if(temp2 == null) break;
            temp1 = temp1.next;
            temp2 = temp2.next;            
        }
        return;
    }
}
