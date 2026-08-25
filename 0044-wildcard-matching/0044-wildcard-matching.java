class Solution {
    public boolean isMatch(String s, String p) {
        int n1 = s.length();
        int n2 = p.length();

        Boolean dp[][] = new Boolean[n1][n2];

        return recursiveMatch(n1-1 , n2-1 , s , p , dp);
    }

    public static boolean recursiveMatch(int i , int j , String s , String p , Boolean dp[][]) {
        if(i<0 && j<0) return true;
        if(j<0) return false;
        if(i<0) {
            for(int k = j ; k>=0 ; k--) {
                if(p.charAt(k)!='*') return false;
            }
            return true;
        }

        if(dp[i][j]!=null) return dp[i][j];

        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
            return dp[i][j] = recursiveMatch(i-1 , j-1 , s , p , dp);
        }
        else if(p.charAt(j) == '*') {
            return dp[i][j] = (recursiveMatch(i , j-1 , s , p , dp) || recursiveMatch(i-1 , j , s , p , dp)); 
        }
        else {
            return dp[i][j] = false;
        }
    }

}