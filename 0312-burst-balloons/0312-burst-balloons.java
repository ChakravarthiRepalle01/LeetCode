class Solution {
    public int maxCoins(int[] arr) {

        int m = arr.length;

        int nums[] = new int[m+2];
        nums[0] = 1;
        nums[m+1] = 1;

        for(int i = 0 ; i<m ; i++) {
            nums[i+1] = arr[i];
        }

        int n = nums.length;
        int dp[][] = new int[n][n];

        for(int L = 2 ; L<n ; L++) {
            for(int i = 1 ; i<(n - L + 1) ; i++) {
                int j = i + L - 1;

                dp[i][j] = 0;

                for(int k = i ; k<j ; k++) {
                    int maxCost = dp[i][k] + dp[k+1][j] + (nums[i-1]*nums[k]*nums[j]);
                    dp[i][j] = Math.max(dp[i][j] , maxCost);
                }
            }
        }

        return dp[1][n-1];
    }
}