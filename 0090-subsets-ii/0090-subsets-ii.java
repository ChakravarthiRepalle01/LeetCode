class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> List = new ArrayList<>();
        HashSet<List<Integer>> setList = new HashSet<>();

        List.add(new ArrayList<>());
        setList.add(new ArrayList<>());

        for(int i = 0 ; i<n ; i++) {
            int k = List.size();
            for(int j = 0 ; j<k ; j++) {
                ArrayList<Integer> newList = new ArrayList<>(List.get(j));
                newList.add(nums[i]);
                if(!setList.contains(newList)) {
                    List.add(newList);
                    setList.add(newList);
                }
            }
        }
        return List;
    }
}