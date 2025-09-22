class MinStack {
    Stack<Integer> maxi;
    Stack<Integer>mini;

    public MinStack() {
      maxi= new Stack<>();
      mini= new Stack<>();
    }
    
    public void push(int val) {
        maxi.push(val);
      if(mini.isEmpty()||val<=mini.peek()){
        mini.push(val);
      }  
    }
    
    public void pop() {
        if(maxi.peek().equals(mini.peek())){
            mini.pop();
        }
        maxi.pop();
    }
    
    public int top() {
        return maxi.peek();
    }
    
    public int getMin() {
        return mini.peek();
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