class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];

        int n = word.length();

        for(int i = 0 ; i<n ; i++) {
            freq[(word.charAt(i)-'a')]++;
        }

        Arrays.sort(freq);

        int totalClicks = 0;

        for(int i = 25 ; i>=0 ; i--) {
            if(i>=18) {
                totalClicks += freq[i]*1;
            }
            else if(i>=10) {
                totalClicks += freq[i]*2;
            }
            else if(i>=2){
                totalClicks += freq[i]*3;
            }
            else {
                totalClicks += freq[i]*4;
            }
        }
        return totalClicks;
    }
}