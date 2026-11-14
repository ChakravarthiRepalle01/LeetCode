class Solution {
    public List<Integer> partitionLabels(String s) {

        int n = s.length();

        int occur[][] = new int[26][2];

        for(int i = 0 ; i<26 ; i++) {
            occur[i][0] = -1;
            occur[i][1] = -1;
        }

        for(int i = 0 ; i<n ; i++) {
            char c = s.charAt(i);
            int index = (int)(c - 'a');
            if(occur[index][0] != -1) {
                occur[index][1] = i;
            }
            else {
                occur[index][0] = i;
                occur[index][1] = i;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int startIdx = 0;

        while(startIdx < n) {
            int start = startIdx;
            int end = occur[(int)(s.charAt(start) - 'a')][1];

            for(int i = start ; i<=end ; i++) {
                end = Math.max(end , occur[(int)(s.charAt(i) - 'a')][1]);
            }
            ans.add(end - start + 1);
            startIdx = end+1;
        }
        
        return ans;
    }
}