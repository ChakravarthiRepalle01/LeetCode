class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        
        int total = 0;
        int open = 0;
        int close = 0;

        for(int i = 0 ; i<n ; i++) {
            if(s.charAt(i) == ')') {
                close++;
            }
            else {
                open++;
            }
            if(close>open) {
                total++;
                open++;
            }
        }

        total += (open - close);

        return total;
    }
}