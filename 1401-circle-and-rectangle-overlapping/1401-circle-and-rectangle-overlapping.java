class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int XClose = Math.max(x1 , Math.min(xCenter , x2));
        int YClose = Math.max(y1 , Math.min(yCenter , y2));

        long distX = xCenter - XClose;
        long distY = yCenter - YClose;

        return (distX*distX + distY*distY <= (long)radius*radius);

    }
}