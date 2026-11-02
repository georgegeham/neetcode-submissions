class Solution {
    public static boolean isValid(String s) {
        HashMap<Character, Character> paranthes = new HashMap<>();
        paranthes.put('(', ')');
        paranthes.put('[', ']');
        paranthes.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (paranthes.containsKey(c))
                stack.push(c);
            else if (!stack.empty() && paranthes.get(stack.peek()) != c)
                return false;
            else if(stack.empty())
                return false;
            else
                stack.pop();
        }
        return stack.empty();
    }

}
