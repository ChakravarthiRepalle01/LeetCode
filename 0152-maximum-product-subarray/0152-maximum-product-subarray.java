class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int p = 1;
        int s = 1;

        int maxProduct = nums[0];

        for(int i = 0 ; i<n ; i++) {
            p *= nums[i];
            s *= nums[n-i-1];

            maxProduct = Math.max(maxProduct , Math.max(s , p));

            if(p == 0) p = 1;
            
            if(s == 0) s = 1;
        }

        return maxProduct;
    }
}