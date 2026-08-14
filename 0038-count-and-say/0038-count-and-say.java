class Solution {
    public String countAndSay(int n) {
        
        StringBuilder sb = new StringBuilder();
        sb.append('1');

        if(n == 1) return sb.toString();

        while(n > 1) {
            int size = sb.length();
            StringBuilder newString = new StringBuilder();
            
            int len = 1;
            char prev = sb.charAt(0);

            for(int i = 1 ; i<size ; i++) {
                if(prev == sb.charAt(i)) {
                    len++;
                }
                else {
                    newString.append(Integer.toString(len));
                    newString.append(prev);
                    len = 1;
                    prev = sb.charAt(i);
                }
            }

            newString.append(Integer.toString(len));
            newString.append(prev);

            n--;
            sb = newString;
        }

        return sb.toString();
    }
}