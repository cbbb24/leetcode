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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode x = p.val > q.val ? p : q;
        TreeNode y = p.val < q.val ? p : q;
        return dfs(root, x ,y);
    }
    public TreeNode dfs(TreeNode root, TreeNode x, TreeNode y){
        if(x.val >= root.val && y.val <= root.val) return root;
        if(x.val < root.val) return dfs(root.left, x, y);
        if(y.val > root.val) return dfs(root.right, x, y);
        return root;
    }
}
