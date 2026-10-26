class Solution {
    public int calculateScore(int a, int b) {
        int cnt1 = 0;
        int cnt2 = 0;

        while(a > 0 && b > 0) {
            if(a%2 == 1) cnt1++;
            if(b%2 == 1) cnt2++;

            a /= 2;
            b /= 2;
        }

        while(a > 0) {
            if(a%2 == 1) cnt1++;
            a /= 2;
        }

        while(b > 0) {
            if(b%2 == 1) cnt2++;
            b /= 2;
        }

        if(cnt1 >= cnt2) {
            return cnt1*cnt2;
        }
        else {
            return cnt2/cnt1;
        }
    }
}