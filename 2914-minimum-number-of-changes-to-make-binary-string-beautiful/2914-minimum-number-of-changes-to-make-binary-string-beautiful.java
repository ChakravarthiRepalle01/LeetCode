class Solution {
    public int minChanges(String s) {
        int n = s.length();

        int i = 0;
        int j = 1;

        int totalCnt = 0;

        while(j < n) {
            if(s.charAt(i) != s.charAt(j)) totalCnt++;
            i += 2;
            j += 2;
        }

        return totalCnt;
    }
}