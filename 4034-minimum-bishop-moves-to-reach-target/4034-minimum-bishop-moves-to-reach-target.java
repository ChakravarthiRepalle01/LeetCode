class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        if(isSameColor(source , target)) {
            if(isSameDiagonal(source , target)) {
                return 1;
            }
            else {
                return 2;
            }
        }
        else {
            return -1;
        }
    }

    public static boolean isSameColor(int source[] , int target[]) {
        if((source[0] + source[1])%2 == (target[0] + target[1])%2) return true;
        else return false;
    }

    public static boolean isSameDiagonal(int source[] , int target[]) {
        if(Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1])) return true;
        else return false;
    }

}