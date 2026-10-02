class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> finalAns = new ArrayList<String>();

        generateTheParanthesis(finalAns , n , 0 , 0 , "");

        return finalAns;
    }

    public static void generateTheParanthesis(List<String> finalAns , int n , int open , int close , String s) {
        if(open == n && close == n) {
            finalAns.add(s);
        }
        if(open < n) {
            generateTheParanthesis(finalAns , n , open+1 , close , s + "(");
        }
        if(close < open) {
            generateTheParanthesis(finalAns , n , open , close+1 , s + ")");
        }
    }

}