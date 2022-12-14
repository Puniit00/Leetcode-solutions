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
public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

    List<List<Integer>> ans = new ArrayList<>();
    pathSumHelper(root, targetSum, 0, ans, new ArrayList<>());
    return ans;
}

public void pathSumHelper(TreeNode root, int targetSum, int sum, List<List<Integer>> ans, List<Integer> path) {
    if(root==null){
        return;
    }
    
    int tsum = sum+root.val;
    path.add(root.val);
    
    if(root.left==null && root.right==null){
        if(tsum==targetSum){
            ans.add(new ArrayList<>(path));
        }
        
        path.remove(path.size()-1);
        return;
    }
    
    pathSumHelper(root.left, targetSum, tsum, ans, path);
    pathSumHelper(root.right, targetSum, tsum, ans, path);
    
    path.remove(path.size()-1);
    
}
}