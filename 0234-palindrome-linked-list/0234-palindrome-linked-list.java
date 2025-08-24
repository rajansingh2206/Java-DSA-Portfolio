/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        //base case
        if(head==null || head.next==null)
            return true;

        // find MidNode
        ListNode midNode=findMidNode(head);

        // reverse second half
        ListNode prevNode=null;
        ListNode currNode=midNode;
        ListNode nextNode=null;
        while(currNode!=null)
        {
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }

        // check left half and right half
        ListNode rightHead=prevNode;
        ListNode leftHead=head;
        while(rightHead!=null)
        {
            if(leftHead.val!=rightHead.val)
                return false;
            leftHead=leftHead.next;
            rightHead=rightHead.next;
        }
        return true;
    }
    private ListNode findMidNode(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}