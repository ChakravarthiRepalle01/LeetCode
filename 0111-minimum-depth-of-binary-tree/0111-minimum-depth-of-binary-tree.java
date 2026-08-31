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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        boolean leftNull = (root.left == null);
        boolean rightNull = (root.right == null);

        if(leftNull && rightNull) return 1;

        int case1 = (leftNull) ? Integer.MAX_VALUE : minDepth(root.left);
        int case2 = (rightNull) ? Integer.MAX_VALUE :minDepth(root.right);

        return 1 + Math.min(case1 , case2);
    }
}