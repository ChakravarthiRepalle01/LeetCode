class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();

        Collections.sort(nums);

        int totalPairs = 0;

        for(int i = 0 ; i<n ; i++) {
        int low = i+1;
        int high = n-1;
        int mid;

        while(low <= high) {
            mid  = low + (high - low)/2;
            if(nums.get(i) + nums.get(mid) < target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        } 
            totalPairs += (high - i);
        }
        return totalPairs;
    }
}