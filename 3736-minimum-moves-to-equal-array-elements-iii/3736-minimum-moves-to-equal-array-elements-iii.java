class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;

        int maxNum = 0;

        for(int i = 0 ; i<n ; i++) maxNum = Math.max(maxNum , nums[i]);

        int totalMoves = 0;

        for(int i = 0 ; i<n ; i++) totalMoves += Math.abs(maxNum - nums[i]);

        return totalMoves;
    }
} 