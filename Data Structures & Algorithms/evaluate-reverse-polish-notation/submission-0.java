class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for(String token: tokens){
            switch (token){
                case "+":
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case "*":
                    numbers.push(numbers.pop() * numbers.pop());
                    break;
                case "-": {
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                    break;
                }
                case "/": {
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left / right);
                    break;
                }
                default:
                    numbers.push(Integer.parseInt(token));
            }
        }
        return numbers.pop();
    }

}
