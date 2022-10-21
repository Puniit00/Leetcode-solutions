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
   boolean bal;
    public boolean isBalanced(TreeNode root) {
        bal = true;
        rec(root);
        return bal;
    }
    
    public int rec(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        else {
            int l = rec(root.left);
            int r = rec(root.right);
            if(Math.abs(l-r) > 1) {
                bal = false;
            }
            return 1 + Math.max(l, r);
        }
    } 
}