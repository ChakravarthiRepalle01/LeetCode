class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;

        int n = nums.length;
        int sum = 0;
        int i = 0;
        int j = 0;

        while(j<=n) {
            if(j<n) sum += nums[j];
            j++;
            while(i<j && sum >= target) {
                minLen = Math.min(minLen , j-i);
                sum -= nums[i];
                i++;
            }
        }

        if(minLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minLen;

    }
}