class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int case1 = robLinear(nums , 0 , n-2);
        int case2 = robLinear(nums , 1 , n-1);

        return Math.max(case1 , case2);
    }

    public static int robLinear(int nums[] , int s , int e) {
        if((e-s+1) == 1) return nums[s];

        int dp[] = new int[e-s+1];

        dp[0] = nums[s+0];
        dp[1] = Math.max(nums[s+0] , nums[s+1]);

        for(int i = 2 ; i<(e-s+1) ; i++) {
            int totalMoney = dp[i-2]+nums[s+i];
            if(totalMoney > dp[i-1]) {
                dp[i] = totalMoney;
            }
            else {
                dp[i] = dp[i-1];
            }
        }
        return dp[e-s];
    }

}