class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int n = nums.length;

        int maxProd = Integer.MIN_VALUE;
        int f = -1;
        int s = -1;

        for(int i = 0 ; i<n ; i++) {
            for(int j = 0 ; j<n ; j++) {
                if(nums[i] > nums[j] && (nums[i] + nums[j] == target)) {
                    int prod = nums[i] * nums[j];
                    if(prod > maxProd) {
                        maxProd = prod;
                        f = i;
                        s = j;
                    }
                }
            }
        }

        return new int[]{f , s};
    }
}