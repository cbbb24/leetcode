/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode tmp = null;
        ListNode tmp_1 = null;
        while(head != null){
            tmp_1 = head.next;
            head.next = tmp;
            tmp = head;
            head = tmp_1;
        }
        return tmp;
    }
}
