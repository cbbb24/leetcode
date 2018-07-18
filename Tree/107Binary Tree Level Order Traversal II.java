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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int i = 1;
        TreeNode temp = null;
        List<Integer> level = new ArrayList<>();
        while(!queue.isEmpty()){
            if(i == 0){
                i = queue.size();
                result.addFirst(level);
                level = new ArrayList<>();
            }
            i--;
            temp = queue.poll();
            level.add(temp.val);
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
            
        }
        result.addFirst(level);
        return result;
    }
}
