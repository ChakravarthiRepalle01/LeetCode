class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        // -2 -> DeadCell Original 1
        // +2 -> LiveCell Original 0

        int dirs[][] = {{1,0} , {0,1} , {-1,0} , {0,-1} , {1,1} , {-1,-1} , {1 , -1} , {-1 , 1}};

        for(int i = 0 ; i<m ; i++) {
            for(int j = 0 ; j<n ; j++) {
                int cell = board[i][j];

                int noOfLiveCells = 0;
                int noOfDeadCells = 0;

                for(int d[] : dirs) {
                    int nr = (i+d[0]);
                    int nc = (j+d[1]);

                    if(nr>=0 && nr<m && nc>=0 && nc<n) {
                        if(board[nr][nc] == 0 || board[nr][nc] == +2) noOfDeadCells++;
                        else if(board[nr][nc] == 1 || board[nr][nc] == -2) noOfLiveCells++;
                    }
                }

                if(cell == 0) {
                    if(noOfLiveCells == 3) {
                        board[i][j] = 2;
                    }
                }
                else {
                    if(noOfLiveCells<2 || noOfLiveCells>3) {
                        board[i][j] = -2;
                    }
                }
            }
        }

        for(int i = 0 ; i<m ; i++) {
            for(int j = 0 ; j<n ; j++) {
                if(board[i][j]<=0) board[i][j] = 0;
                else board[i][j] = 1;
            }
        }
    }
}