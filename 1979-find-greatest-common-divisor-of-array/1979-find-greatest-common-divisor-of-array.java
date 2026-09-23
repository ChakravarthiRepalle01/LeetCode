class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;

        int smallNum = nums[0];
        int largeNum = nums[0];

        for(int i = 0 ; i<n ; i++) {
            smallNum = Math.min(smallNum , nums[i]);
            largeNum = Math.max(largeNum , nums[i]);
        }

        return getGCD(smallNum , largeNum);
    }

    public static int getGCD(int a , int b) {
        if(b == 0) return a;

        return getGCD(b , a%b);
    }

}