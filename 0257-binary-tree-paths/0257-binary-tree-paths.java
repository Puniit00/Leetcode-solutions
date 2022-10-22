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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        
        if(root == null) return list;
        
        paths(root, list, "");
        return list;
    }
    
    private void paths(TreeNode root, List<String> list, String str){
        if(root.left==null && root.right==null) list.add(str+root.val);
        if(root.left!=null) paths(root.left, list, str+root.val+"->");
        if(root.right!=null) paths(root.right, list, str+root.val+"->");
    }
}