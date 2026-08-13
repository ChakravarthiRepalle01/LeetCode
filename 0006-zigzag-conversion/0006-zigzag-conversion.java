class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || s.length()<=numRows) return s;

        StringBuilder stringArray[] = new StringBuilder[numRows];
        int n = s.length();

        for(int i = 0 ; i<numRows ; i++) {
            stringArray[i] = new StringBuilder();
        }

        int isRow = 0;
        boolean isUpDown = true;

        for(int i = 0 ; i<n; i++) {
            stringArray[isRow].append(s.charAt(i));

            if(isUpDown) isRow++;
            else isRow--;

            if(isRow>=numRows) {
                isUpDown = false;
                isRow = (numRows-2);
            }
            else if(isRow<=-1) {
                isUpDown = true;
                isRow = 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<numRows ; i++) {
            sb.append(stringArray[i]);
        }

        return sb.toString();
    }
}