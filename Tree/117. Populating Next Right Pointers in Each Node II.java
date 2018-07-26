/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        TreeLinkNode cur = root;
        TreeLinkNode head = new TreeLinkNode(0);
        TreeLinkNode lead = head;
        while(cur != null){
            if(cur.left != null){
                lead.next = cur.left;
                lead = lead.next;
            }
            if(cur.right != null){
                lead.next = cur.right;
                lead = lead.next;
            }
            if(cur.next != null)
                cur = cur.next;
            else{
                cur = head.next;
                head.next = null;
                lead = head;
            }
        }
    }
}
