class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;

        int totalWays = 0;

        int freq[] = new int[10];

        for(int i = 0 ; i<n ; i++) {
            freq[digits[i]]++;
        }

        for(int h = 1 ; h<=9 ; h++) {
            for(int t = 0 ; t<=9 ; t++) {
                for(int u = 0 ; u<=9 ; u+=2) {
                    if(freq[h] > 0) {
                        freq[h]--;
                        if(freq[t] > 0) {
                            freq[t]--;
                            if(freq[u] > 0) {
                                totalWays++;
                            }
                            freq[t]++;
                        }
                        freq[h]++;
                    }
                }
            }
        }

        return totalWays;
    }

}