class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;

        boolean allAreZeros = true;
        int xor = 0;

        for(int i = 0 ; i<n ; i++) {
            xor = xor ^ nums[i];
            if(nums[i]!=0) {
                allAreZeros = false;
            }
        }

        if(allAreZeros) {
            return 0;
        }
        else if(xor == 0) {
            return n-1;
        }
        else {
            return n;
        }
    }
}