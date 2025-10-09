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
    private List<Integer> list=new ArrayList<>();
    private int idx=0;
    public void recoverTree(TreeNode root) {

        helper(root);
        Collections.sort(list);
        helper2(root);
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
    private void helper2(TreeNode root)
    {
        if(root==null)
            return;

        helper2(root.left);
        if(root.val!=list.get(idx))
            root.val=list.get(idx);
        idx++;
        helper2(root.right);

    }
    private void helper(TreeNode root)
    {
        if(root==null)
            return;

        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}