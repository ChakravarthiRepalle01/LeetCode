class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;

        List<int[]> pos1 = new ArrayList<>();
        List<int[]> pos2 = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i<n ; i++) {
            for(int j = 0 ; j<n ; j++) {
                if(img1[i][j] == 1) {
                    pos1.add(new int[]{i,j});
                }
                if(img2[i][j] == 1) {
                    pos2.add(new int[]{i,j});
                }
            }
        }

        int s1 = pos1.size();
        int s2 = pos2.size();
        int maxOverLap = 0;

        for(int[] p1 : pos1) {
            int r1 = p1[0];
            int c1 = p1[1];

            for(int[] p2 : pos2) {
                int r2 = p2[0];
                int c2 = p2[1];

                int dr = r2-r1;
                int dc = c2-c1;
                int unq = (dr+100)*1000 + (dc+100);

                map.merge(unq , 1 , Integer::sum);
                maxOverLap = Math.max(maxOverLap , map.get(unq));
            }
        }

        return maxOverLap;
    }
}