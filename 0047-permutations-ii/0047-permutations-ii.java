class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        List<List<Integer>> finalAns = new ArrayList<>();

        boolean used[] = new boolean[n];

        permutate(nums , new boolean[n] , new ArrayList<>() , finalAns);

        return finalAns;
    }

    public static void permutate(int nums[] , boolean used[] , ArrayList<Integer> currAns , List<List<Integer>> finalAns) {
        if(currAns.size() == nums.length) {
            finalAns.add(new ArrayList<>(currAns));
            return;
        }

        for(int i = 0 ; i<nums.length ; i++) {
            if(used[i]) continue;

            if(i>0 && nums[i] == nums[i-1] && !used[i-1]) {
                continue;
            }

            used[i] = true;
            currAns.add(nums[i]);
            permutate(nums , used , currAns , finalAns);
            currAns.remove(currAns.size() - 1);
            used[i] = false;
        }

    }

}