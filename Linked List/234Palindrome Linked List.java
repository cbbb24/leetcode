/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        ListNode prev1 = null;
        ListNode prev2 = null;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        prev1 = slow.next;
        slow.next = null;
        slow = prev1;
        while(prev1 != null){
            prev1 = slow.next;
            slow.next = prev2;
            prev2 = slow;
            slow = prev1;
        }
        while(prev2 != null){
            if(prev2.val == head.val){
                prev2 = prev2.next;
                head = head.next;
            }else
                return false;
        }
        return true;
    }
}
