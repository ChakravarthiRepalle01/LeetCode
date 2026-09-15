class Solution {
    public long dividePlayers(int[] skill) {
        long totalSum = 0;
        long totalChemistry = 0;
        int n = skill.length;

        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();

        for(int i = 0 ; i<n ; i++) {
            totalSum += skill[i];
            map.merge(skill[i] , 1 , Integer::sum);
        }
        
        long eachTeamSkill = (totalSum/(n/2));

        for(int i = 0 ; i<n ; i++) {
            if(map.get(skill[i]) > 0) {
                int ele = skill[i];
                int rem = (int)eachTeamSkill-ele;

                if(map.containsKey(rem) && map.get(rem) > 0) {
                    map.merge(ele , -1 , Integer::sum);
                    map.merge(rem , -1 , Integer::sum);
                    totalChemistry += ele*rem;
                }
                else {
                    return -1;
                }
            }
        }

        return totalChemistry;
    }
}