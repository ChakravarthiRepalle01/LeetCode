class Solution {
    public int climbStairs(int n) {
        //TimeComplexity - O(n+n);
        //SpaceComplexity - O(n+n)
        int dp[] = new int[n+1];

        Arrays.fill(dp , -1);

        return recursiveHelper(0 , n , dp);
    }

    public static int recursiveHelper(int i , int n , int dp[]) {
        if(i == n) return 1;
        if(i > n) return 0;

        if(dp[i]!=-1) return dp[i];

        return dp[i] = recursiveHelper(i+1 , n , dp) + recursiveHelper(i+2 , n , dp);
    }

}