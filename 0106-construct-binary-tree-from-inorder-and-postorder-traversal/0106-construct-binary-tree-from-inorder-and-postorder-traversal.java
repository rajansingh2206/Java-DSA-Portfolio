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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        inorderMap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            inorderMap.put(inorder[i],i);
        }
        return helper(inorder,0,n-1,postorder,0,n-1);
    }
    private TreeNode helper(int[] inorder, int is,int ie, int[] postorder,int ps,int pe)
    {
        if(ps>pe || is>ie)
            return null;
        TreeNode root=new TreeNode(postorder[pe]);
        int rootInorderIndex=inorderMap.get(postorder[pe]);
        int numsLeft=rootInorderIndex-is;

        root.left=helper(inorder,is,rootInorderIndex-1,postorder,ps,ps+numsLeft-1);
        root.right=helper(inorder,rootInorderIndex+1,ie,postorder,ps+numsLeft,pe-1);
        return root;
    }
}