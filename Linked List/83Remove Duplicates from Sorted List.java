/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        while(start != null){
            if(start.next == null){
                break;
            }
            if(start.val == start.next.val){
                start.next = start.next.next;
            }else{
                start = start.next;
            }
        }
        return head;
    }
}
