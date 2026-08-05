class Solution {
    public int minAddToMakeValid(String s) {
        int totalCnt = 0;
        int open = 0;

        int n = s.length();

        for(int i = 0 ; i<n ; i++) {
            if(s.charAt(i) == ')') {
                if(open>0) open--;
                else totalCnt++;
            }
            else {
                open++;
            }
        }
        return (totalCnt+open);
    }
}