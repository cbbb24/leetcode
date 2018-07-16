/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode test = dummy;
        while(test.next != null){
            if(test.next.val == val){
                test.next = test.next.next;
            }else{
                test = test.next;
            }
        }
        return dummy.next;       
    }
}
