class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n = drones.length;

        int minDistance = Integer.MAX_VALUE;
        int minIdx = -1;

        for(int i = 0 ; i<n ; i++) {
            int x = Math.abs(target[0]-drones[i][0]);
            int y = Math.abs(target[1]-drones[i][1]);

            int dist = x+y;

            if(dist<=drones[i][2]) {
                if(dist<minDistance) {
                    minDistance = dist;
                    minIdx = i;
                }
            }
        }
        return minIdx;
    }
}