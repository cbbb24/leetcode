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
/**
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return true;
        TreeNode node = null;
        TreeNode pre = root;
        while(pre != null || !stack.isEmpty()){
            while(pre != null){
                stack.push(pre);
                pre = pre.left;
            }
            pre = stack.pop();
            if(node != null && pre.val <= node.val) return false;
            node = pre;
            pre = pre.right;
        }
        return true;
    }
*/
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return true;
        TreeNode node = root;
        List<Integer> list = new ArrayList<>();
        while(node != null || !stack.isEmpty()){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            
            node = stack.pop();
            list.add(node.val);
            node = node.right;
            
        }
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i + 1))
                return false;
        }
        return true;
    }
}
