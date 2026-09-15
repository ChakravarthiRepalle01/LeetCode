class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        long totalCnt = 0;

        Arrays.sort(nums);

        for(int i = 0 ; i<n ; i++) {
            int a = nums[i];
            int L = lower-a;
            int R = upper-a;

            int lowerBound = n;
            int upperBound = -1;

            int low = (i+1);
            int high = (n-1);
            int mid;

            while(low<=high) {
                mid = low + (high - low)/2;
                if(nums[mid]>=L) {
                    lowerBound = mid;
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }

            low = (i+1);
            high = (n-1);

            while(low<=high) {
                mid = low + (high - low)/2;
                if(nums[mid]<=R) {
                    upperBound = mid;
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }

            if(lowerBound<=upperBound) totalCnt += (upperBound-lowerBound+1);
        }

        return totalCnt;
    }
}