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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int min = 0;
        TreeNode node = null;
        int i = 1;
        while(!queue.isEmpty()){
            if(i == 0){
                i = queue.size();
                min++;
            }
            i--;
            node = queue.poll();
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            if(node.left == null && node.right == null) return ++min;
            
        }
        return min;
    }
}
