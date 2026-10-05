class Solution {
    public int minRotations(String s) {
        int currPoint = 0;
        int n = s.length();
        int totalSum = 0;

        for(int i = 0 ; i<n ; i++) {
            int num = (int)(s.charAt(i) - '0');

            totalSum += Math.min(Math.abs(currPoint - num) , 10 - Math.abs(currPoint - num));

            currPoint = num;
        }

        return totalSum;
    }
}