class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int totalTime = 0;
        int prev = 0;

        for(int num : requests) {
            totalTime += Math.abs(num - prev);
            prev = num;
        }

        return totalTime;
    }
}