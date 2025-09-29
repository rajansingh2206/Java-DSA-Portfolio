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
    TreeNode prevValue=null;
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        {
            TreeNode newNode=new TreeNode(val);
            return newNode;
        }
        helper(root,val);
        return root;
    }
    private void helper(TreeNode root, int val)
    {
        if(root==null && prevValue!=null)
        {
            TreeNode newNode=new TreeNode(val);
            if(prevValue.val>val)
                prevValue.left=newNode;
            else
                prevValue.right=newNode;
        }
        if(root==null)
            return;
        prevValue=root;
        if(root.val>val)
            helper(root.left,val);
        else
            helper(root.right,val);
    }
}