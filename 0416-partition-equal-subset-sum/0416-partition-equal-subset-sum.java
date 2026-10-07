class Solution {

    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int totalSum = 0 ;
        
        for(int i = 0 ; i<n ; i++) {
            totalSum += nums[i];
        }

        if(totalSum%2 == 0) {

            Boolean memo[][] = new Boolean[n][totalSum + 1];

            return findTarget(nums , n , totalSum/2 , 0 , 0 , memo);
        }
        else {
            return false;
        }
    }

    public static boolean findTarget(int nums[] , int n , int target , int idx , int sum , Boolean memo[][]) {
        if(sum == target) return true;

        if(sum > target || idx == n) return false;

        if(memo[idx][sum] != null) return memo[idx][sum];

        boolean oneCase = findTarget(nums , n , target , idx+1 , sum+nums[idx] , memo);
        boolean twoCase = findTarget(nums , n , target , idx+1 , sum ,memo);

        return memo[idx][sum] = (oneCase || twoCase);
    }

}