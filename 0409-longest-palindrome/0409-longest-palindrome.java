class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();

        HashMap<Character , Integer> map = new HashMap<>();

        boolean isOdd = false;

        int totalLength = 0;

        for(int i = 0 ; i<n ; i++) {
            map.merge(s.charAt(i) , 1 , Integer::sum);
        }

        for(Map.Entry<Character , Integer> entry : map.entrySet()) {
            totalLength += entry.getValue()/2;
            if(entry.getValue()%2 == 1) isOdd = true;
        } 

        totalLength *= 2;
        
        if(isOdd) totalLength++;

        return totalLength;
    }
}