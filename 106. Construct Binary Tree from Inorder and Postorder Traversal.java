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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return dfs(0, inorder.length - 1, postorder.length - 1, inorder, postorder, map);
    }
    public TreeNode dfs(int instart, int inend, int poststart, int[] inorder, int[] postorder, Map<Integer, Integer> map){
        if(poststart < 0 || instart > inend) return null;
        TreeNode root = new TreeNode(postorder[poststart]);
        int index = map.get(postorder[poststart]);
        root.left = dfs(instart, index - 1, poststart - (inend - index - 1 + 1 + 1), inorder, postorder, map); 
        root.right = dfs(index + 1, inend, poststart - 1, inorder, postorder, map);
        return root;
    }
}
