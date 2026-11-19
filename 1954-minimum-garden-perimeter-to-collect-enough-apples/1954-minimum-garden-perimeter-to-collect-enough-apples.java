class Solution {
    public long minimumPerimeter(long neededApples) {
        
        long i = 1;

        while(true) {
            long gotApples = getApples(i);
            if(gotApples >= neededApples) {
                break;
            }
            i++;
        }

        return 8*i;
    }

    public static long getApples(long n) {
        return 2*n*(n+1)*(2*n+1);
    }

}