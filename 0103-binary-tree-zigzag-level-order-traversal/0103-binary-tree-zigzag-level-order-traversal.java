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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean leftToRight=true;
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> list=new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode currentNode=q.remove();
                if(leftToRight)
                    list.addLast(currentNode.val);
                else
                    list.addFirst(currentNode.val);
                if(currentNode.left!=null)  q.offer(currentNode.left);
                if(currentNode.right!=null)  q.offer(currentNode.right);
            }
            result.add(list);
            leftToRight=!leftToRight;
        }
        return result;
    }
}