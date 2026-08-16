class Solution {
    public boolean stoneGameIX(int[] stones) {
        int noOfStones = stones.length;
        int divisibleThree[] = new int[3];

        for(int i = 0 ; i<noOfStones ; i++) {
            divisibleThree[stones[i]%3]++;
        }

        if(divisibleThree[0]%2 == 0) {
            return (divisibleThree[1]>=1 && divisibleThree[2]>=1);
        }
        else {
            return Math.abs(divisibleThree[1]-divisibleThree[2])>2;
        }
    }
}