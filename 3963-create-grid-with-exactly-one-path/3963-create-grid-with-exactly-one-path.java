class Solution {
    public String[] createGrid(int m, int n) {
        String finalAns[][] = new String[m][n];
        String ans[] = new String[m];
        //Allocate Free Cells
        for(int j = 0 ; j<n ; j++) {
            finalAns[0][j] = ".";
        }

        for(int i = 0 ; i<m ; i++) {
            finalAns[i][n-1] = ".";
        }

        for(int i = 1 ; i<m ; i++) {
            for(int j = 0 ; j<(n-1) ; j++) {
                finalAns[i][j] = "#";
            }
        }

        int idx = 0;
        for(int i = 0 ; i<m ; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j<n ; j++) {
                sb.append(finalAns[i][j]);
            }
            ans[i] = sb.toString();
        }

        return ans;
    }
}