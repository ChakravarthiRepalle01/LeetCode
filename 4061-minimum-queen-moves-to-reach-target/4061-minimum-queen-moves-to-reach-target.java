class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        if((target[0] == source[0]) && (source[1] == target[1])) {
            return 0;
        }
        else if((Math.abs(target[0]-source[0]) == Math.abs(target[1]-source[1])) || (target[0] == source[0]) || (source[1] == target[1])) {
            return 1;
        }
        else {
            return 2;
        }
    }
}