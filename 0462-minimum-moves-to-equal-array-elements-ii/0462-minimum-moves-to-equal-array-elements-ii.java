class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int median = nums[n/2];

        int minMoves = 0;

        for(int i = 0 ; i<n ; i++) minMoves += Math.abs(nums[i] - median);

        return minMoves;
    }
}