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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        level(root, res);
        
        return res;
    }
    
    private void level(TreeNode root, List<List<Integer>> res){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            Queue<TreeNode> temp = new LinkedList<>();
            
            while(!q.isEmpty()){
                temp.add(q.remove());
            }
            
            while(!temp.isEmpty()){
               TreeNode node = temp.remove();
               list.add(node.val);
               if(node.left!=null) q.add(node.left);
               if(node.right!=null) q.add(node.right);
            }
            
            res.add(list);
        }
    }
}