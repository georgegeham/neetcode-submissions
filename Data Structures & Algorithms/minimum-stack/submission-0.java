class MinStack {

    List<Integer> stack;
    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
    }

    public void pop() {
        stack.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        int min = stack.getFirst();
        for(int num : stack){
            if(num < min)
                min = num;
        }
        return min;
    }

}
