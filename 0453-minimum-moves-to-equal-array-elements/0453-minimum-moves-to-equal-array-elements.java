class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int currOps = 0;
        int prevOps = 0;

        for(int i = 1 ; i<n ; i++) {
            int temp = currOps;
            currOps += (nums[i] + currOps - nums[i-1] - prevOps);
            prevOps = temp;
        }

        return currOps;
    }
}