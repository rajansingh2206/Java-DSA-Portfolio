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
    TreeNode prev=null;
    public int minDiffInBST(TreeNode root) {
        if(root==null)
            return Integer.MAX_VALUE;

        int minDis=Integer.MAX_VALUE;

        if(root.left!=null)
        {
            int leftDis=minDiffInBST(root.left);
            minDis=Math.min(minDis,leftDis);
        }
        
        if(prev!=null)
        {
            minDis=Math.min(minDis,root.val-prev.val);
        }
        prev=root;

        if(root.right!=null)
        {
            int rightDis=minDiffInBST(root.right);
            minDis=Math.min(minDis,rightDis);
        }
        return minDis;
    }
}