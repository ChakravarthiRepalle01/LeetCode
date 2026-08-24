class Solution {
    public int divide(int dividend, int divisor) {
        boolean isDNeg = (dividend<0) ? true : false;
        boolean isdNeg = (divisor<0) ? true : false;

        long D = (long)(dividend);
        long d = (long)(divisor);

        D = Math.abs(D);
        d = Math.abs(d);

        long totalRemove = 0;

        while(D >= d) {
            int i = 0;
            while(true) {
                if(D >= (d << (i+1))) i++;
                else break;
            }
            totalRemove += (1L << i);
            D -= (d << i);
        }

        if((isDNeg && isdNeg) || !(isDNeg || isdNeg)) {
            if(totalRemove > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else return (int)totalRemove;
        } 
        else {
            if(totalRemove < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else return -(int)totalRemove;
        }

    }
}