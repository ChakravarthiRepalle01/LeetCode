class NumMatrix {
    long prefixSum[][];

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        prefixSum = new long[m][n];

        for(int i = 0 ; i<m ; i++) {
            for(int j = 0 ; j<n ; j++) {
                prefixSum[i][j] += matrix[i][j];
                if(i > 0) {
                    prefixSum[i][j] += prefixSum[i-1][j];
                }
                if(j > 0) {
                    prefixSum[i][j] += prefixSum[i][j-1];
                }
                if(i > 0 && j > 0) {
                    prefixSum[i][j] -= prefixSum[i-1][j-1];
                }
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        long totalSum = 0;
        totalSum += prefixSum[row2][col2];
        if(row1 > 0) {
            totalSum -= prefixSum[row1-1][col2];
        }
        if(col1 > 0) {
            totalSum -= prefixSum[row2][col1-1];
        }
        if(row1 > 0 && col1 > 0) {
            totalSum += prefixSum[row1-1][col1-1];
        }
        return (int)totalSum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */