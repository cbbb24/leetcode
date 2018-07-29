class Solution {
    public boolean isValidSerialization(String preorder) {
        if(preorder == null) return false;
        Stack<String> stack = new Stack<>();
        String[] tree = preorder.split(",");
        for(int i = 0; i < tree.length; i++){
            while(!stack.isEmpty() && stack.peek().equals("#") && tree[i].equals("#")){
                stack.pop();
                if(stack.isEmpty() || stack.peek().equals("#"))
                   return false;
                stack.pop();
            }
            stack.push(tree[i]);            
        }
        return !stack.isEmpty() && (stack.pop().equals("#") && stack.isEmpty());
    }
}
