class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;

        int totalCnt = 0;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i<n ; i++) {
            map.merge(nums[i] , 1 , Integer::sum);
        }

        for(int i = 0 ; i<n ; i++) {
            int ele = nums[i];
            int wanted = k - ele;
            if(wanted == ele) {
                if(map.get(ele) > 1) {
                    map.merge(ele , -2 , Integer::sum);
                    totalCnt++;
                }
            }
            else {
                if(map.containsKey(wanted) && map.get(ele) > 0 && map.get(wanted) > 0) {
                    totalCnt++;
                    map.merge(wanted , -1 , Integer::sum);
                    map.merge(ele , -1 , Integer::sum);
                }
            }
        }

        return totalCnt;
    }
}