class Solution {
    public List<List<String>> solveNQueens(int n) {
        int board[] = new int[n];

        List<List<String>> result = new ArrayList<>();

        NQueens(0 , board , n , result);

        return result;
    }

    public static boolean isSafe(int row , int col , int board[]) {
        for(int i = 0 ; i<row ; i++) {
            if(board[i] == col || Math.abs(board[i] - col) == (row - i)) return false;
        }
        return true;
    }

    public static void NQueens(int row , int board[] , int n , List<List<String>> result) {
        if(row == n) {
            List<String> ans = new ArrayList<>();

            for(int r = 0 ; r<n ; r++) {
                int c = board[r];

                StringBuilder sb = new StringBuilder();

                for(int k = 0 ; k<n ; k++) {
                    if(k != c) {
                        sb.append(".");
                    }
                    else {
                        sb.append("Q");
                    }
                }

                ans.add(sb.toString());
            }

            result.add(ans);

            return;
        }

        for(int col = 0 ; col<n ; col++) {
            if(isSafe(row , col , board)) {
                board[row]  = col;
                NQueens(row + 1 , board , n , result);
            }
        }
    }

}