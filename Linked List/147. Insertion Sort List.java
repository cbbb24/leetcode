/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode start1 = head, end = head, start2 = head.next;
        while(start2 != null){
            ListNode temp1 = start1, temp2 = start2;
            end.next = null;
            start2 = start2.next;
            if(temp2.val < start1.val){
                temp2.next = start1;
                start1 = temp2;
            }else if(temp2.val >= end.val){
                end.next = temp2;
                temp2.next = null;
                end = temp2;
            }else{
                while(temp2.val > temp1.next.val){
                    temp1 = temp1.next;
                }
                temp2.next = temp1.next;
                temp1.next = temp2;
            }
        }
        return start1;
    }
}
