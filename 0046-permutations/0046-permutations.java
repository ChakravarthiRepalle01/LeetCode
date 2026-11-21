class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        solvePermute(new ArrayList<Integer>() , new boolean[n] , nums , n ,result);

        return result;
    }

    public static void solvePermute(ArrayList<Integer> curr , boolean used[] , int nums[] , int n , List<List<Integer>> result) {
        if(curr.size() == n) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0 ; i<n ; i++) {
            if(used[i]) continue;

            used[i] = true;
            curr.add(nums[i]);
            solvePermute(curr , used , nums , n , result);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

}