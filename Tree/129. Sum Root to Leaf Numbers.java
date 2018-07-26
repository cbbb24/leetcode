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
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        int cur_sum = 0;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur_sum = cur_sum * 10 + cur.val;
                cur = cur.left;
            }
            cur = stack.peek();
            if(cur.left == null && cur.right == null){
                sum += cur_sum;
            }
            if(cur.right != null && cur.right != pre){
                cur = cur.right;
                continue;
            }
            pre = cur;
            cur_sum /= 10;
            stack.pop();
            cur = null;
        }
        return sum;
    }
}
