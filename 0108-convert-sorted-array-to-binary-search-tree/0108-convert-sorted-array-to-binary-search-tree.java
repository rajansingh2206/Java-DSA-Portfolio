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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int n=nums.length;
        return buildBST(nums,0,n-1);
    }
    private TreeNode buildBST(int[] nums,int start,int end)
    {
        if(start>end)
            return null;
        int mid=start+(end-start)/2;
        TreeNode newNode=new TreeNode(nums[mid]);
        newNode.left=buildBST(nums,start,mid-1);
        newNode.right=buildBST(nums,mid+1,end);
        return newNode;
    }
}