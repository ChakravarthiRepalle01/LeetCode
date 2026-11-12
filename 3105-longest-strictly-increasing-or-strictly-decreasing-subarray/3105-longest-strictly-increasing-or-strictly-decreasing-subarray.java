class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        int longestLength = 1;

        int incCount = 1;
        int decCount = 1;

        for(int i = 1 ; i<n ; i++) { 
            if(nums[i] > nums[i-1]) {
                incCount++;
                longestLength = Math.max(longestLength , incCount);
                decCount = 1;
            }
            else if(nums[i] < nums[i-1]) {
                decCount++;
                longestLength = Math.max(longestLength , decCount);
                incCount = 1;
            }
            else {
                longestLength = Math.max(longestLength , incCount);
                longestLength = Math.max(longestLength , decCount);
                incCount = 1;
                decCount = 1;
            }
        }

        return longestLength;
    }
}