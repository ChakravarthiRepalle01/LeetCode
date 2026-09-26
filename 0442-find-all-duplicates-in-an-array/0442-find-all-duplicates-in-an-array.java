class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();

        int n = nums.length;

        for(int i = 0 ; i<n ; i++) {
            int num = Math.abs(nums[i])-1;

            if(nums[num] < 0) {
                ans.add(num+1);
            }

            nums[num] *= -1;
        }

        return ans;
    }
}