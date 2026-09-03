class Solution {
    public String decodeString(String s) {

        int n = s.length();
        Stack<Integer> countStack = new Stack<Integer>();
        Stack<StringBuilder> stringStack = new Stack<StringBuilder>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for(int i = 0 ; i<n ; i++) {
            if(Character.isDigit(s.charAt(i))) {
                k = k*10 + (int)(s.charAt(i) - '0');
            }
            else if(s.charAt(i) == '[') {
                countStack.push(k);
                stringStack.push(currentString);

                currentString = new StringBuilder();
                k = 0;
            }
            else if(s.charAt(i) == ']') {
                int currentK = countStack.pop();
                StringBuilder decodeString = stringStack.pop();

                for(int j = 0 ; j<currentK ; j++) {
                    decodeString.append(currentString);
                }
                currentString = decodeString;
            }
            else {
                currentString.append(s.charAt(i));
            }
        }

        return currentString.toString();
    }
}