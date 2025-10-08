/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return null;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        Node prev=null;
        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            if(currNode ==null)
            {
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else
            {
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
                if(prev!=null)
                    prev.next=currNode;
            }
            prev=currNode;
        }
        return root;
    }
}