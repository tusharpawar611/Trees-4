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
    public boolean isValidBST(TreeNode root) {
        return helperFunction(root,null,null);
    }
    
    public boolean helperFunction(TreeNode root,Integer low,Integer high){
        if(root == null){
            return true;
        }

        if((low != null && root.val <= low) || (high!=null && high <= root.val)){
            return false;
        }

        return (helperFunction(root.left,low,root.val) && helperFunction(root.right,root.val,high));
    }
}