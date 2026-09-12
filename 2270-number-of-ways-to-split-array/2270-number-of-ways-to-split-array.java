class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        long prefixSum = 0;

        int n = nums.length;
        int totalCnt = 0;
        
        for(int i = 0 ; i<n ; i++) {
            totalSum += nums[i];
        }

        for(int i = 0 ; i<(n-1) ; i++) {
            prefixSum += nums[i];

            if(prefixSum >= (totalSum-prefixSum)) {
                totalCnt++;
            }

        }
        return totalCnt;
    }
}