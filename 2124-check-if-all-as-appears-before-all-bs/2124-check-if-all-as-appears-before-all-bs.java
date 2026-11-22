class Solution {
    public boolean checkString(String s) {
        int n = s.length();

        boolean hasA = false;
        boolean hasB = false;

        for(int i = 0 ; i<n ; i++) {
            if(s.charAt(i) == 'a') {
                if(hasB) return false;
                hasA = true;
            }
            else {
                hasB = true;
            }
        }

        return true;
    }
}