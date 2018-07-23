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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return list;
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> onelevel = new ArrayList<Integer>(); 
            for(int i = 0; i < len; i++){
                onelevel.add(queue.peek().val);
                TreeNode temp = queue.poll();
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            list.add(onelevel);
        }
        return list;
    }
}
