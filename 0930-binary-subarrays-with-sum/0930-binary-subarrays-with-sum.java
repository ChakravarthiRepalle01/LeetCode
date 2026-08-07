class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        int totalSum = 0;
        long totalCnt = 0;

        map.put(0 , 1);

        for(int i = 0 ; i<n ; i++) {
            totalSum += nums[i];
            if(map.containsKey(totalSum - goal)) {
                totalCnt += map.get(totalSum-goal);
            }
            map.merge(totalSum , 1 , Integer::sum);
        }
        return (int)totalCnt;
    }
}