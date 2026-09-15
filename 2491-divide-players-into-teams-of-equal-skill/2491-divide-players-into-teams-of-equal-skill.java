class Solution {
    public long dividePlayers(int[] skill) {
        long totalSum = 0;
        long totalChemistry = 0;
        int n = skill.length;

        int count[] = new int[1001];

        for(int i = 0 ; i<n ; i++) {
            totalSum += skill[i];
            count[skill[i]]++;
        }

        long eachTeamSkill = (totalSum/(n/2));

        for(int i = 0 ; i<n ; i++) {
            int ele = skill[i];
            if(count[ele] > 0) {
                int rem = (int)eachTeamSkill-ele;

                if(rem<=1000 && rem>0 && count[rem]>0) {
                    count[rem]--;
                    count[ele]--;
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