class MinStack {

    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> min = new ArrayDeque<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty()){
            min.push(val);
            return;
        }
        min.push(Math.min(val,min.peek()));
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
