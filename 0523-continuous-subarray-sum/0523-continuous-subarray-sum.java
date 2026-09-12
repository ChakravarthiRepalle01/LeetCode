import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map remainder -> earliest index seen
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);

        long totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            int mod = (int) (totalSum % k);

            if (map.containsKey(mod)) {
                if (i - map.get(mod) >= 2) {
                    return true;
                }
            } else {
                map.put(mod, i);
            }
        }

        return false;
    }
}