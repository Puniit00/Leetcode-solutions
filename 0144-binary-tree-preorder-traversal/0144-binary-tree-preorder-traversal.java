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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        preorder(root, list);
        return list;
    }
    private void preorder(TreeNode root, List<Integer> list){
        list.add(root.val);
        
        if(root.left!=null) preorder(root.left, list);
        if(root.right!=null) preorder(root.right, list);
    }
}