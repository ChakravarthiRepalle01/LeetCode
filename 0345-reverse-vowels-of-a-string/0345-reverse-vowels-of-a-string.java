class Solution {
    public String reverseVowels(String s) {
        int n = s.length();

        int i = 0;
        int j = n-1;
        StringBuilder sb = new StringBuilder(s);

        while(i<j) {
            while(i<n && !isVowel(sb.charAt(i))) i++;
            while(j>=0 && !isVowel(sb       .charAt(j))) j--;

            if(i<j) {
                char temp = sb.charAt(i);
                sb.setCharAt(i , sb.charAt(j));
                sb.setCharAt(j , temp);

                i++;
                j--;
            }
        }

        return sb.toString();
    }

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        else return false;
    }

}