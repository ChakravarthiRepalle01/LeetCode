class Solution {
    public int search(int[] nums, int target) {
        return bSearch(nums , target , 0 , nums.length -1);
    }

    public static int bSearch(int nums[] , int target , int low , int high) {
        if(low > high) return -1;

        int mid = low + (high - low)/2;

        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) {
            return bSearch(nums , target , mid+1 , high);
        }
        else {
            return bSearch(nums , target , low , mid-1);
        }

    }

}