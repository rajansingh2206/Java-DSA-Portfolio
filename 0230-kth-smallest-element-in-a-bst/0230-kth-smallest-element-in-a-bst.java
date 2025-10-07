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
    private int prevIdx=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return -1;

        if(root.left!=null)
        {
            int leftAns=kthSmallest(root.left,k);
            if(leftAns!=-1)
                return leftAns;
        }
        if(prevIdx+1==k)
            return root.val;
        prevIdx=prevIdx+1;
        if(root.right!=null)
        {
            int rightAns=kthSmallest(root.right,k);
            if(rightAns!=-1)
                return rightAns;
        }
        return -1;
    }
}