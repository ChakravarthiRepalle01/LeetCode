class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        // I Have To Fins Shortest Path From (0,0) to (n-1 , n-1)
        // 0 - Is Free Way , 1 - Is Obstacle
        int n = grid.length;

        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;

        Queue<int[]> q = new LinkedList<>();

        int dirs[][] = {{0,1} , {1,0} , {1 , 1} , {0 , -1} , {1 , -1} , {-1 , 0} , {-1 , -1} , {-1 , 1}};

        q.offer(new int[]{0,0});
        grid[0][0] = 1;
        int totalCnt = 1;

        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0 ; i<size ; i++) {
                int location[] = q.poll();

                if(location[0] == (n-1) && location[1] == (n-1)) return totalCnt;

                for(int d[] : dirs) {
                    int r = location[0] + d[0];
                    int c = location[1] + d[1];
                    if(r>=0 && c>=0 && r<n && c<n && grid[r][c] == 0) {
                        q.offer(new int[]{r,c});
                        grid[r][c] = 1;
                    }
                }

            }

            totalCnt++;
        }

        return -1;
    }
}