class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1) return 0;

        int n = nums.length;

        int currProd = 1;
        int totalCnt = 0;

        int i = 0;

        for(int j = 0 ; j<n ; j++) {
            currProd *= nums[j];

            while(currProd>=k) {
                currProd /= nums[i++];
            }

            totalCnt += (j-i+1);

        }

        return totalCnt;
    }
}