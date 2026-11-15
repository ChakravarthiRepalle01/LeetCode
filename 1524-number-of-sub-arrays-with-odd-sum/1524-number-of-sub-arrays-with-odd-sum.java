class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0;
        long evenCount = 1;
        long currentPrefixSum = 0;
        long totalOddSubarrays = 0;
        int MOD = 1_000_000_007;
        
        for(int num : arr) {
            currentPrefixSum += num;

            if(currentPrefixSum%2 == 0) {
                totalOddSubarrays = (totalOddSubarrays + oddCount)%MOD;
                evenCount++;
            }
            else {
                totalOddSubarrays = (totalOddSubarrays + evenCount)%MOD;
                oddCount++;   
            }
        }
        return (int)totalOddSubarrays;
    }
}