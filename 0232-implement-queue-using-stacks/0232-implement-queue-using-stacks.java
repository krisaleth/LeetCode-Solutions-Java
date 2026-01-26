class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }
    
    public void push(int x) {
        if (s1.empty()) {
            s1.push(x);
        }
        else {
            while(!s1.empty()) {
                s2.push(s1.pop());
            }
            s2.push(x);

            while(!s2.empty()) {
                s1.push(s2.pop());
            }
        }
    }
    
    public int pop() {
        int res = s1.peek();
        s1.pop();
        return res;
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.empty();
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