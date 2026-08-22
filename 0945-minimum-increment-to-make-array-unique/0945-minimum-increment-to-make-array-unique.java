class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        int totalCnt = 0;

        Arrays.sort(nums);

        for(int i = 0 ; i<n ; i++) {
            int j = (i+1);
            while(j<n && nums[j] == nums[i]) {
                totalCnt++;
                nums[j++]++;
            }
        }

        return totalCnt;
    }
}