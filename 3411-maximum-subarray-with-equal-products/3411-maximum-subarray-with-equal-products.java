class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < n; j++) {
                prod *= nums[j];
                gcd = getGCD(gcd, nums[j]);
                lcm = getLCM(lcm, nums[j]);

                if (prod == lcm * gcd) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
                if (prod > 25200) {
                    break;
                }
            }
        }

        return maxLength;
    }

    public static long getGCD(long a, long b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }

    public static long getLCM(long a, long b) {
        return (a / getGCD(a, b)) * b;
    }
}