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
    private Map<Integer,Integer> inorderMap;
    public TreeNode helper(int[] preorder,int ps,int pe, int[] inorder,int is,int ie)
    {
         if(ps>pe || is>ie)
            return null;
        TreeNode root=new TreeNode(preorder[ps]);
        int rootInorderIdx=inorderMap.get(preorder[ps]);
        int numsLeft=rootInorderIdx-is;
        root.left=helper(preorder,ps+1,ps+numsLeft,inorder,is,rootInorderIdx-1);
        root.right=helper(preorder,ps+numsLeft+1,pe,inorder,rootInorderIdx+1,ie);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap=new HashMap<>();
        int n=preorder.length;
        for(int i=0;i<inorder.length;i++)
        {
            inorderMap.put(inorder[i],i);
        }
        return helper(preorder,0,n-1,inorder,0,n-1);
    }
}