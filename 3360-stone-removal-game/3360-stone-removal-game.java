class Solution {
    public boolean canAliceWin(int n) {
        boolean aliceTurn = true;

        int toRemove = 10;
        while(n > 0) {
            if(n < toRemove) break;

            n -= toRemove;
            toRemove--;
            aliceTurn = !aliceTurn;
        }

        return (aliceTurn == false);
    }
}