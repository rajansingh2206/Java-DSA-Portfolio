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
    int ans=0;
    private int heightOfBinaryTree(TreeNode root)
    {
        if(root==null)
            return 0;

        int sizeOfLeftTree=heightOfBinaryTree(root.left);
        int sizeOfRightTree=heightOfBinaryTree(root.right);
        ans=Math.max(ans,sizeOfLeftTree+sizeOfRightTree);
        return Math.max(sizeOfLeftTree,sizeOfRightTree)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        heightOfBinaryTree(root);
        return ans;
    }
}