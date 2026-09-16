/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxValue = 0;
    public int maxAncestorDiff(TreeNode root) {
        preOrder(root.left , root.val , root.val);
        preOrder(root.right , root.val , root.val);
        return maxValue;
    }

    public void preOrder(TreeNode root , int maxVal , int minVal) {
        
        if(root == null) return;

        int case1 = Math.abs(maxVal-root.val);
        int case2 = Math.abs(minVal-root.val);

        maxValue = Math.max(maxValue , Math.max(case1 , case2));

        maxVal = Math.max(maxVal , root.val);
        minVal = Math.min(minVal , root.val);

        preOrder(root.left , maxVal , minVal);
        preOrder(root.right , maxVal , minVal);
    }

}