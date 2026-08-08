class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        int result = 0;

        for(int i = 0 ; i<32 ; i++) {
            int bitCount = 0;
            for(int j = 0 ; j<n ; j++) {
                if(((nums[j] >> i) & 1) == 1) bitCount++;
            }
            if(bitCount%3 == 1) {
                result = result | (1 << i);
            }
        }

        return result;
    }
}