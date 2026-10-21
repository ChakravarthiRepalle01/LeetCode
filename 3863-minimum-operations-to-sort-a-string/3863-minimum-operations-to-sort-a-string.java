class Solution {
    public int minOperations(String s) {
        int n = s.length();

        char minChar = s.charAt(0);
        char maxChar = s.charAt(0);
        boolean isSorted = true;

        for(int i = 1 ; i<n ; i++) {
            minChar = (char)Math.min(minChar , s.charAt(i));
            maxChar = (char)Math.max(maxChar , s.charAt(i));

            if(s.charAt(i) < s.charAt(i-1)) isSorted = false;
        }

        if(isSorted) {
            return 0;
        }
        else if(s.charAt(0) == minChar || s.charAt(n-1) == maxChar) {
            return 1;
        }
        else if(s.charAt(0) == maxChar && s.charAt(n-1) == minChar) {

            if(n == 2) return -1;

            boolean isThere = false;
            for(int i = 1 ; i<n-1 ; i++) {
                if(s.charAt(i) == minChar || s.charAt(i) == maxChar) {
                    isThere = true;
                    break;
                }
            }

            if(isThere) return 2;
            else return 3;
        }
        else {
            return 2;
        } 
    }
}