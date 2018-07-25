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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;
        List<Integer> path = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();        
        TreeNode cur = root;
        TreeNode pre = null;
        int cur_sum = 0;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                path.add(cur.val);
                cur_sum += cur.val;
                cur = cur.left;
            }
            cur = stack.peek();
            if(cur.left == null && cur.right == null && cur_sum == sum){
                result.add(new LinkedList<Integer>(path));
            }
            if(cur.right != null && cur.right != pre){
                cur = cur.right;
                continue;
            }
            stack.pop();
            path.remove(path.size() - 1);
            pre = cur;            
            cur_sum -= cur.val;
            cur = null;
            
        }
        return result;
    }
}
