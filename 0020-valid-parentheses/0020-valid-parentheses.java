class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0 ; i<n ; i++) {
            if(s.charAt(i) == ')') {
                if(stack.isEmpty() || stack.peek() != '(') return false;
                else stack.pop();
            }
            else if(s.charAt(i) == '}') {
                if(stack.isEmpty() || stack.peek() != '{') return false;
                else stack.pop();
            }
            else if(s.charAt(i) == ']') {
                if(stack.isEmpty() || stack.peek() != '[') return false;
                else stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        return (stack.isEmpty()) ? true : false;
    }
}