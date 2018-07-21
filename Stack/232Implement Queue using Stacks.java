class MyQueue {
    Stack<Integer> queue;
    Stack<Integer> helper;
    private int front;
    /** Initialize your data structure here. */
    public MyQueue() {
        queue = new Stack<>();
        helper = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(queue.isEmpty()) front = x;
        while(!queue.isEmpty()){
            helper.push(queue.pop());
        }
        helper.push(x);
        while(!helper.isEmpty()){
            queue.push(helper.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return queue.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return queue.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
