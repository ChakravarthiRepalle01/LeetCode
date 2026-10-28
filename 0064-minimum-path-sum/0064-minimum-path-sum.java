class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];

        for(int i = 0 ; i<m ; i++) {
            for(int j = 0 ; j<n ; j++) {
                dp[i][j] = -1;
            }
        }

        return traverseAllPaths(grid , dp , 0 , 0  , m , n);
    }

    public static int traverseAllPaths(int grid[][] , int dp[][] , int i , int j , int m , int n) {
        if(i >= m || j >= n)  return Integer.MAX_VALUE;

        if(i == (m-1) && j == (n-1)) {
            return grid[i][j];
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = traverseAllPaths(grid , dp , i+1 , j , m , n);
        int right = traverseAllPaths(grid , dp , i , j+1 , m , n);

        dp[i][j] = grid[i][j] + Math.min(down , right);
        return dp[i][j];
    }

}