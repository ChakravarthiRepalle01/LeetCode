class Solution {
    public int minInsertions(String s) {
        int n = s.length();

        int neededRight = 0;
        int insertions = 0;

        for(int i = 0 ; i<n ; i++) {
            if(s.charAt(i) == '(') {
                neededRight += 2;

                if(neededRight%2 == 1) {
                    insertions++;
                    neededRight--;
                }

            }
            else {
                neededRight--;

                if(neededRight < 0) {
                    insertions++;
                    neededRight += 2;
                }

            }
        }

        return (neededRight + insertions);

    }
}