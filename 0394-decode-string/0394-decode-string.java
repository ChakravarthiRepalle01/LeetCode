import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public String decodeString(String s) {
        int n = s.length();
        Deque<Integer> numQueue = new LinkedList<Integer>();
        Deque<StringBuilder> stringQueue = new LinkedList<StringBuilder>();

        // Maintain ONE active tracking string and ONE number accumulator
        StringBuilder currString = new StringBuilder();
        int currNum = 0;

        for(int i = 0 ; i < n ; i++) {
            char currChar = s.charAt(i);
            
            if(Character.isDigit(currChar)) {
                // Smoothly handles 1-digit, 2-digit, or 3-digit multipliers safely
                currNum = currNum * 10 + (currChar - '0');
            }
            else if(currChar == '[') {
                // Push the multiplier and the string built so far onto their respective stacks
                numQueue.addFirst(currNum);
                stringQueue.addFirst(currString);
                
                // Reset both trackers for the inside context of the bracket
                currString = new StringBuilder();
                currNum = 0;
            }
            else if(currChar == ']') {
                // Retrieve the outer scope string and the multiplier loop count
                StringBuilder decodedTemplate = stringQueue.removeFirst();
                int k = numQueue.removeFirst();
                
                // Repeat the inner string segment K times into the parent context
                for(int j = 0 ; j < k ; j++) {
                    decodedTemplate.append(currString);
                }
                // The combined sequence becomes our new working current string
                currString = decodedTemplate;
            }
            else {
                // Normal plain character: just safely append to the current active segment
                currString.append(currChar);
            }
        }

        return currString.toString();
    }
}