class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int cnt = 0;
        int maxCnt = 0;

        for(int i = 0 ; i<n ; i++) {
            if(s.charAt(i) == '(') {
                cnt++;
            }
            else if(s.charAt(i) == ')'){
                maxCnt = Math.max(maxCnt , cnt);
                cnt--;
            }
        }

        return maxCnt;
    }
}