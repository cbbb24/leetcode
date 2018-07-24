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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while(!queue.isEmpty()){
            List<Integer> single = new ArrayList<>();
            int len = queue.size();
            for(int i = 0; i < len; i++){
                TreeNode node = queue.peek();
                if(level % 2 == 0){
                    single.add(0, queue.poll().val);
                }else{
                    single.add(queue.poll().val);
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            level++;
            list.add(single);
        }
        return list;
    }
}
