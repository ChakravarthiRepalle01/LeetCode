class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;

        int minOddNum = -1;
        int minElement = nums[0];

        for(int i = 0 ; i<n ; i++) {
            if(nums[i]%2 == 1) {
                if(minOddNum == -1) minOddNum = nums[i];
                else minOddNum = Math.min(minOddNum , nums[i]);
            }
            minElement = Math.min(minElement , nums[i]);
        }

        if(minOddNum == -1) return true;
        else return (minElement == minOddNum);

    }
}