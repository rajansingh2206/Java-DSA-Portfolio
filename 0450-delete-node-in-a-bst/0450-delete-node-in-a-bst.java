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
    private TreeNode getInorderSuccessor(TreeNode currentNode)
    {
        while(currentNode.left!=null && currentNode!=null)
            currentNode=currentNode.left;
        return currentNode;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return null;

        if(root.val>key)
            root.left=deleteNode(root.left,key);
        else if(root.val<key)
            root.right=deleteNode(root.right,key);
        else
        {
            if(root.left==null)
            {
                TreeNode temp=root.right;
                root.right=null;
                return temp;
            }
            else if(root.right==null)
            {
                 TreeNode temp=root.left;
                root.left=null;
                return temp;
            }
            else
            {
                TreeNode is=getInorderSuccessor(root.right);
                root.val=is.val;
                root.right=deleteNode(root.right,is.val);
            }
        }
        return root;
    }
}