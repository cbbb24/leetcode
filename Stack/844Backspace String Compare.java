class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack_s = new Stack<>();
        Stack<Character> stack_t = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '#'){
                if(stack_s.isEmpty())
                    continue;
                else
                    stack_s.pop();
            }else
                stack_s.push(S.charAt(i));
        }
        for(int i = 0; i < T.length(); i++){
            if(T.charAt(i) == '#'){
                if(stack_t.isEmpty())
                    continue;
                else
                    stack_t.pop();
            }else
                stack_t.push(T.charAt(i));
        } 
        if(stack_s.size() != stack_t.size()) return false;
        while(!stack_s.isEmpty()){
            if(stack_s.pop() == stack_t.pop())
                continue;
            return false;
        }
        return true;
    }
}
