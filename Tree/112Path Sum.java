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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.val == sum && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

/**    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sub = new Stack<>();
        path.push(root);
        sub.push(root.val);
        while(!path.isEmpty()){
            TreeNode node = path.pop();
            int val = sub.pop();
            if(node.left == null && node.right == null && val == sum)
                return true;
            if(node.left != null){
                path.push(node.left);
                sub.push(val + node.left.val);
            }
            if(node.right != null){
                path.push(node.right);
                sub.push(val + node.right.val);
            }
        }
        return false;
    }
*/
}
