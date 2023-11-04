class MinStack {
    List<Integer> stack;
    public MinStack() {
        stack=new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        int m=stack.get(0);
        int n=stack.size();
        for(int i=1;i<n;i++){
            m=Math.min(m,stack.get(i));
        }
        return m;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */