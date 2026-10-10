class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        int n = nums.length;
        int idx = 0;
        for(int i = nums[0] ; i<=nums[n-1] ; i++) {
            if(i == nums[idx]) {
                idx++;
            }
            else {
                ans.add(i);
            }
        }

        return ans;
    }
}