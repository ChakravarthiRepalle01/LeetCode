class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();

        int maxLength = 0;

        int i = 0;
        map.merge(nums[0] , 1 , Integer::sum);

        int j = 1;

        while(j<n) {
            if(map.containsKey(nums[j]) && map.get(nums[j]) == k) {
                maxLength = Math.max(maxLength , j-i);
                while(nums[i]!=nums[j]) {
                    map.merge(nums[i++] , -1 , Integer::sum);
                }
                map.merge(nums[i++] , -1 , Integer::sum);
                map.merge(nums[j++] , 1 , Integer::sum);
            }
            else {
                map.merge(nums[j++] , 1 , Integer::sum);
            }
        }
        maxLength = Math.max(maxLength , j-i);
        return maxLength;
    }
}