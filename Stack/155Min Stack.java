class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack; 
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(min);
        stack.push(x);
        min = x < min ? x : min;
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        if(stack.pop() == min) min = stack.pop();
        else stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
