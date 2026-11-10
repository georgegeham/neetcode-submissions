class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        double[] times = new double[target];
        int n = position.length;
        for (int i = 0; i < n; i++) {
            double time = (double) (target - position[i]) / speed[i];
            times[position[i]] = time;
        }
        for (int i = target - 1; i > -1; i--) {
            if (times[i] == 0.0)
                continue;
            if (stack.isEmpty() || stack.peek() < times[i])
                stack.push(times[i]);
        }
        return stack.size();
    }

}
