class Solution {
    public int countServers(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int rowCnt[] = new int[m];
        int colCnt[] = new int[n];

        for(int i = 0 ; i<m ; i++) {
            int totalCnt = 0;
            for(int j = 0 ; j<n ; j++) {
                if(grid[i][j] == 1) totalCnt++;
            }
            rowCnt[i] = totalCnt;
        }

        for(int j = 0 ; j<n ; j++) {
            int totalCnt = 0;
            for(int i = 0 ; i<m ; i++) {
                if(grid[i][j] == 1) totalCnt++;
            }
            colCnt[j] = totalCnt;
        }

        int totalCnt = 0;

        for(int i = 0 ; i<m ; i++) {
            for(int j = 0 ; j<n ; j++) {
                if((rowCnt[i] > 1 || colCnt[j] > 1) && grid[i][j] == 1) totalCnt++;
            }
        }

        return totalCnt;
    }
}