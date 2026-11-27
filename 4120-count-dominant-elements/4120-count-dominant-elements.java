class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;

        if(n == 1) return n;

        int totalCnt = 0;

        for(int i = 0 ; i<n ; i++) {
            if(i > 0 && i<(n-1)) {
                if(2*nums[i] >= nums[i-1] + nums[i+1]) totalCnt++;
            } 
            else if(i == 0) {
                if(nums[i] >= nums[i+1]) totalCnt++;
            }
            else {
                if(nums[i] >= nums[i-1]) totalCnt++;
            }
        }

        return totalCnt;
    }
}