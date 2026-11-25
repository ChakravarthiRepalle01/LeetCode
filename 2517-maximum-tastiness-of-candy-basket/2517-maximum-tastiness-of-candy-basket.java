class Solution {
    public int maximumTastiness(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);

        int low = 0;
        int high = nums[n-1] - nums[0];
        int maxCandy = 0;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(canPick(nums , k , mid)) {
                maxCandy = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return maxCandy;
    }

    public static boolean canPick(int nums[] , int k , int need) {
        int count = 1;
        int last = nums[0];

        for(int i = 1 ; i<nums.length ; i++) {
            if(nums[i] - last >= need) {
                last = nums[i];
                count++;
            }
        }

        return count>=k ;
    }

}