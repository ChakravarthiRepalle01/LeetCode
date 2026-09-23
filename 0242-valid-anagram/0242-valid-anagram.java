class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        int arr[] = new int[26];

        for(int i = 0 ; i<n1 ; i++) arr[s.charAt(i)-'a']++;

        for(int i = 0 ; i<n2 ; i++) arr[t.charAt(i)-'a']--;

        for(int i = 0 ; i<26 ; i++) if(arr[i]!=0) return false;

        return true;
    }
}