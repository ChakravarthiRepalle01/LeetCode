class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();

        while(num > 0) {
            int k = num%2;
            num /= 2;
            if(k == 0) sb.append("1");
            else sb.append("0");
        }

        int finalNum = 0;

        for(int i = 0 ; i<sb.length() ; i++) {
            if(sb.charAt(i) == '1') finalNum += (int)(Math.pow(2 , i));
        }

        return finalNum;
    }
}