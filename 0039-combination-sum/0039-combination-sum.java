class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;

        List<List<Integer>> finalAns = new ArrayList<>();

        combination(candidates , target , new ArrayList<>() , finalAns , n , 0);

        return finalAns;
    }

    public static void combination(int nums[] , int target , ArrayList<Integer> curr , List<List<Integer>> finalAns, int n , int start) {
        if(target == 0) {
            finalAns.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0) return;

        for(int i = start ; i<n ; i++) {
            if(nums[i] <= target) {
                curr.add(nums[i]);
                combination(nums , target - nums[i] , curr , finalAns , n , i);
                curr.remove(curr.size() - 1);
            }
        }

    }

}