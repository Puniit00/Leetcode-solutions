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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode ans = search(root, val);
        return ans;
    }
    
    private TreeNode search(TreeNode root, int val){
        if(root == null) return null;
        if(val == root.val) return root;
        if(val>root.val) return search(root.right, val);
        return search(root.left, val);
    }
}