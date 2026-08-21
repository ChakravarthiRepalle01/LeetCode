class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n = boxTypes.length;
        double ratio[][] = new double[n][2];
        double totalProfit = 0;

        for(int i = 0 ; i<n ; i++) {
            ratio[i][0] = boxTypes[i][1];
            ratio[i][1] = i;
        }

        Arrays.sort(ratio , (a,b) -> Double.compare(a[0] , b[0]));

        for(int i = (n-1) ; i>=0 ; i--) {
            int idx = (int)ratio[i][1];
            int boxCount = boxTypes[idx][0];
            int unitsPerBox = boxTypes[idx][1];

            if(truckSize >= boxCount) {
                totalProfit += (double)boxCount*unitsPerBox;
                truckSize -= boxCount;
            }
            else {
                totalProfit += (double)truckSize*unitsPerBox;
                break;
            }

        }

        return (int)totalProfit;
    }
}