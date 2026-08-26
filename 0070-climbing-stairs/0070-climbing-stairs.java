class Solution {
    public int climbStairs(int n) {

        //Space Optimization
        //Time Complexity - O(n)
        //Space Complexity - O(1)

        int prev = 1;
        int secPrev = 1;
        int curr;
        for(int i = 2 ; i<=n ; i++) {
            curr = prev + secPrev;
            secPrev = prev;
            prev = curr;
        }

        return prev;

        //Tabulation
        //Time Complexity - O(n)
        //Space Complexity - O(n)
        // int dp[] = new int[n+1];

        // Arrays.fill(dp , -1);

        // dp[0] = 1;
        // dp[1] = 1;

        // for(int i = 2 ; i<=n ; i++) {
        //     dp[i] = dp[i-1] + dp[i-2];
        // }

        // return dp[n];

        //TimeComplexity - O(n+n);
        //SpaceComplexity - O(n+n)
        // int dp[] = new int[n+1];

        // Arrays.fill(dp , -1);

        // return recursiveHelper(0 , n , dp);
    }

    //Memoization
    // public static int recursiveHelper(int i , int n , int dp[]) {
    //     if(i == n) return 1;
    //     if(i > n) return 0;

    //     if(dp[i]!=-1) return dp[i];

    //     return dp[i] = recursiveHelper(i+1 , n , dp) + recursiveHelper(i+2 , n , dp);
    // }

}