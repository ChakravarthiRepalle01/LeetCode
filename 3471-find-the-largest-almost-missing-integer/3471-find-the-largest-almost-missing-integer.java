class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if(k == 1) {
            HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();

            for(int i = 0 ; i<n ; i++) map.merge(nums[i] , 1 , Integer::sum);

            int maxNum = -1;

            for(Map.Entry<Integer , Integer> entry : map.entrySet()) {
                if(entry.getValue() == 1) maxNum = Math.max(maxNum , entry.getKey());
            }
            return maxNum;
        }
        else if(k == n) {
            int maxNum = nums[0];
            for(int i = 1 ; i<n ; i++) maxNum = Math.max(maxNum , nums[i]);
            return maxNum;
        }

        int firstCase = nums[0];
        int secondCase = nums[n-1];

        for(int i = (n > k) ? 1 : k; i<n ; i++) {
            if(nums[i] == firstCase) {
                firstCase = -1;
                break;
            }
        }

        for(int j = (n > k) ? (n-2) : (n-k-1); j>=0 ; j--) {
            if(nums[j] == secondCase) {
                secondCase = -1;
                break;
            }
        }

        return Math.max(firstCase , secondCase);
    }
}