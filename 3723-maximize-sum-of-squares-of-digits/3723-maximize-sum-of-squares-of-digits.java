class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(9*num < sum) return "";

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<num ; i++) {
            if(sum>=9) {
                sb.append('9');
                sum -= 9;
            }
            else if(sum > 0) {
                sb.append((char)('0' + sum));
                sum = 0;
            }
            else {
                sb.append('0');
            }
        }

        return sb.toString();
    }
}