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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        printPreorder(list,root);
        return list;
    }
    public void printPreorder(List<Integer> list,  TreeNode root) {
        if(root==null)
            return;
            
        list.add(root.val);
        printPreorder(list,root.left);
        printPreorder(list,root.right);
    }
}