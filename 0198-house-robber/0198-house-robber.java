class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int lastPrev = nums[0];
        int lastButPrev = Math.max(nums[0] , nums[1]);

        for(int i = 2 ; i<n ; i++) {
            int curr = nums[i] + lastPrev;
            if(curr > lastButPrev) {
                lastPrev = lastButPrev;
                lastButPrev = curr;
            }
            else {
                lastPrev = lastButPrev;
            }
        }
        return lastButPrev;
    }
}