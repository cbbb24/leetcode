class MyStack {
    Queue<Integer> stack;
    Queue<Integer> helper;
    int top = 0;
    /** Initialize your data structure here. */
    public MyStack() {
        stack = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        stack.add(x);
        top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(stack.size() == 1) return stack.poll();
        while(stack.size() > 1){
            top = stack.poll();
            helper.add(top);
        }
        int remove = stack.poll();
        Queue<Integer> temp = new LinkedList<>();
        temp = helper;
        helper = stack;
        stack = temp;
        return remove;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(stack.isEmpty()) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
