class Solution {
    public boolean threeFibonacciSum(int n) {
        long reqSum = (long)n;

        if(reqSum == 0 || reqSum == 1) return false;

        boolean flag = false;
        long a = 0;
        long b = 1;
        long c = 1;

        while(true) {
            long presentSum = a + b + c;

            if(presentSum == reqSum) {
                flag = true;
                break;
            }

            if(presentSum > reqSum) break;

            long temp = b+c;
            a = b;
            b = c;
            c = temp;
        }
        return flag;
    }
}