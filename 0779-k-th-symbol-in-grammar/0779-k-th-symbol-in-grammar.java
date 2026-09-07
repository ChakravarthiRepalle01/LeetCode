class Solution {
    public int kthGrammar(int n, int k) {
        if(n == 1 || k == 1) {
            return 0;
        }

        if(k%2 != 0) {
            return kthGrammar(n-1 , (k+1)/2);
        }
        else {
            if(kthGrammar(n-1 , k/2) == 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}