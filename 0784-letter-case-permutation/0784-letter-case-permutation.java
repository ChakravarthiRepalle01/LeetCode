class Solution {
    public List<String> letterCasePermutation(String s) {
        int n = s.length();
        
        List<String> finalAns = new ArrayList<>();

        solve(0 , n , s , finalAns);

        return finalAns;
    }

    public static void solve(int idx , int n , String s , List<String> finalAns) {
        if(idx == n) {
            finalAns.add(s);
            return;
        }

        if(s.charAt(idx)>='a' && s.charAt(idx)<='z') {
            StringBuilder curr = new StringBuilder(s);
            curr.setCharAt(idx , (char)('A' - 'a' + s.charAt(idx)));
            solve(idx+1 , n , curr.toString() , finalAns);
        }
        else if(s.charAt(idx)>='A' && s.charAt(idx)<='Z') {
            StringBuilder curr = new StringBuilder(s);
            curr.setCharAt(idx , (char)('a' + s.charAt(idx) - 'A'));
            solve(idx+1 , n , curr.toString() , finalAns);
        }
        solve(idx+1 , n , s , finalAns);
    }
}