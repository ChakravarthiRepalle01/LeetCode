class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        stack.push(new StringBuilder());

        int n = s.length();

        for(int i = 0 ; i<n ; i++) {
            if(s.charAt(i) == '(') {
                stack.push(new StringBuilder());
            }
            else if(s.charAt(i) == ')') {
                StringBuilder latest = stack.pop();
                latest.reverse();
                StringBuilder old = stack.pop();
                old.append(latest);
                stack.push(old);
            }
            else {
                StringBuilder latest = stack.pop();
                latest.append(s.charAt(i));
                stack.push(latest);
            }
        }

        return stack.pop().toString();
    }
}