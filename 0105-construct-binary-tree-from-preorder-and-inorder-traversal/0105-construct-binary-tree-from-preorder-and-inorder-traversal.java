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
    private int preIdx=0;
    private Map<Integer,Integer> inorderMap;
    public TreeNode helper(int[] preorder, int[] inorder,int left,int right)
    {
        if(left>right)
            return null;
        TreeNode root=new TreeNode(preorder[preIdx]);
        int inIdx=inorderMap.get(preorder[preIdx]);
        preIdx++;
        root.left=helper(preorder,inorder,left,inIdx-1);
        root.right=helper(preorder,inorder,inIdx+1,right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            inorderMap.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,inorder.length-1);
    }
}