class Solution {
    public String reverseWords(String s) {
        int n = s.length();

        StringBuilder finalStr = new StringBuilder();
        StringBuilder subStr = new StringBuilder();

        int i = 0;
        int j = (n-1);

        while(i<n && s.charAt(i) == ' ') {
            i++;
        }

        while(j>=0 && s.charAt(j) == ' ') {
            j--;
        }

        while(i<=j) {
            if(s.charAt(i)!=' ') {
                subStr.append(s.charAt(i));
                i++;
            }
            else {
                while(i<=j && s.charAt(i) == ' '){
                    i++;
                }
                finalStr.append(subStr.reverse().toString());
                finalStr.append(" ");
                subStr = new StringBuilder();
            }
        }

        finalStr.append(subStr.reverse().toString());
        return finalStr.reverse().toString();

    }
}