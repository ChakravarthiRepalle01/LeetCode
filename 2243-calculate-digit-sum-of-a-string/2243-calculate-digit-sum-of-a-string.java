class Solution {
    public String digitSum(String s, int k) {
        
        StringBuilder finalAns = new StringBuilder(s);

        while(finalAns.length() > k) {
            int noOfCompleteRounds = finalAns.length()/k;
            int noOfRemaining = finalAns.length()%k;

            StringBuilder newFinal = new StringBuilder();
            
            int index = 0;

            for(int i = 0 ; i<noOfCompleteRounds ; i++) {
                int totalSum = 0;
                for(int j = 0 ; j<k ; j++) {
                    totalSum += (int)(finalAns.charAt(index) - '0');
                    index++;
                }
                newFinal.append(Integer.toString(totalSum));
            }

            if(noOfRemaining > 0) {
                int totalSum = 0;
                while(index < finalAns.length()) {
                    totalSum += (int)(finalAns.charAt(index) - '0');
                    index++;
                }
                newFinal.append(Integer.toString(totalSum));
            }

            finalAns = new StringBuilder(newFinal.toString());
        }

        return finalAns.toString();
    }
}