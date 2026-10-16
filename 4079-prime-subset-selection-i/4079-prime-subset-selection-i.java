class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans = new ArrayList<>();

        boolean simpleSieve[] = new boolean[n+1];

        for(int i = 2 ; i*i<=n ; i++) {
            if(!simpleSieve[i]) {
                for(int j = i*i ; j<=n ; j+=i) {
                    simpleSieve[j] = true;
                }
            }
        }

        long totalSum = 0;

        for(int i = 2 ; i<=n ; i++) {
            if(!simpleSieve[i]) {
                if((totalSum + i) <= s) {
                    totalSum += i;
                    ans.add(i);
                }
                else {
                    break;
                }
            }
        }

        return ans;
    }
}