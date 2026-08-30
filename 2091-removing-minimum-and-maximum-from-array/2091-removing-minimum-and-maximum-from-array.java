class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        if(n == 1) return 1;

        int maxIndex = 0;
        int minIndex = 0;
        int minEle = nums[0];
        int maxEle = nums[0];

        for(int i = 0 ; i<n ; i++) {
            if(nums[i]>maxEle) {
                maxEle = nums[i];
                maxIndex = i;
            }
            else if(nums[i]<minEle) {
                minEle = nums[i];
                minIndex = i;
            }
        }

        int min = Math.min(minIndex , maxIndex);
        int max = Math.max(maxIndex , minIndex);

        return Math.min(max+1 , Math.min(n - min , min+1+n-max));
    }
}