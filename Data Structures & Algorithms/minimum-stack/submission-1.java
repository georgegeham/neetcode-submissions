public class MinStack {
    private final List<Integer> stack = new ArrayList<>();
    private final List<Integer> mins = new ArrayList<>();

    public void push(int val) {
        stack.add(val);
        mins.add(mins.isEmpty() ? val : Math.min(val, mins.getLast()));
    }

    public void pop() {
        stack.removeLast();
        mins.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return mins.getLast();
    }
}