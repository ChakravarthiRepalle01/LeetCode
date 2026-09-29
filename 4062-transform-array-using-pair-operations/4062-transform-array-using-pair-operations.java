class Solution {
    public boolean canTransform(int[] source, int[] target) {
        int n = source.length;

        long totalSum1 = 0;
        long totalSum2 = 0;

        for(int i = 0 ; i<n ; i++) {
            totalSum1 += source[i];
            totalSum2 += target[i];
        }

        return (totalSum1 == totalSum2);
    }
}