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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        dfs(root, list);
        return list;
    }
    public void dfs(TreeNode root, List<Integer> list){
        list.add(root.val);
        if(root.left != null){
            dfs(root.left, list);
        }
        if(root.right != null){
            dfs(root.right, list);
        }
    }
}
