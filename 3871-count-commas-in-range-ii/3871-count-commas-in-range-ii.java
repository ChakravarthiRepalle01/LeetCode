class Solution {
    public long countCommas(long n) {
        // 1 to 999 -> 0
        //10^3 to 10^6-1 -> 1
        //10^6 to 10^9-1 -> 2
        //10^9 to 10^12-1 -> 3
        //10^12 to 10^15-1 -> 4
        //10^15 -> 5

        long totalCommas = 0;

        if(n == (long)Math.pow(10,15)) {
            totalCommas += 5;
            n = (long)Math.pow(10,15)-1;
        }
        if(n >= (long)Math.pow(10,12)) {
            totalCommas += (n-(long)Math.pow(10,12)+1)*4;
            n = (long)Math.pow(10,12)-1;
        }
        if(n >= (long)Math.pow(10,9)) {
            totalCommas += (n-(long)Math.pow(10,9)+1)*3;
            n = (long)Math.pow(10,9)-1;
        }
        if(n >= (long)Math.pow(10,6)) {
            totalCommas += (n-(long)Math.pow(10,6)+1)*2;
            n = (long)Math.pow(10,6)-1;
        }
        if(n >= 1000) {
            totalCommas += (n-999)*1;
        }

        return totalCommas;

    }
}