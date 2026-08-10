class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> List = new ArrayList<>();

        List.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i = 0 ; i<n ; i++) {
            start = (i > 0 && nums[i] == nums[i-1]) ? end : 0;
            end = List.size();

            for(int j = start ; j<end ; j++) {
                ArrayList<Integer> newList = new ArrayList<>(List.get(j));
                newList.add(nums[i]);
                List.add(newList);
            }
        }
        return List;
    }
}