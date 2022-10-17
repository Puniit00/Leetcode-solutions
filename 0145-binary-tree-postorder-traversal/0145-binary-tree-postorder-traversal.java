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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        postorder(list, root);
        return list;
    }
    private void postorder(List<Integer> list, TreeNode root){
        if(root.left!=null) postorder(list, root.left);
        if(root.right!=null) postorder(list, root.right);
        list.add(root.val);
    }
}