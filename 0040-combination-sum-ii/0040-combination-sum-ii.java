class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        findAllCombinations(candidates , target , 0 , n , new ArrayList<Integer>() , result);

        return result;
    }

    public static void findAllCombinations(int candidates[] , int target , int start , int n , ArrayList<Integer> curr , List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0) return;

        for(int i = start ; i<n ; i++) {
            if(i> start && candidates[i] == candidates[i-1]) continue;

            if(candidates[i] > target) break;

            curr.add(candidates[i]);
            findAllCombinations(candidates , target - candidates[i] , i+1 , n , curr , result);
            curr.remove(curr.size() - 1);
        }
    }   

}