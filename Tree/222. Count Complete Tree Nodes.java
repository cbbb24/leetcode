/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int left_h = 0;
        int right_h = 0;
        for(TreeNode cur = root; cur != null; cur = cur.left)
            left_h++;
        for(TreeNode cur = root; cur != null; cur = cur.right)
            right_h++;
        if(left_h == right_h) return (1 << left_h) - 1;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
