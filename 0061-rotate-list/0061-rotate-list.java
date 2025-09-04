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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode newHead = rotateList(head, k);
        return newHead;
    }

    private ListNode rotateList(ListNode head, int k) {
        if(head==null || head.next==null || k==0)   return head;
        int len=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            len++;
        }
        for (int i = 0; i < k%len; i++) {
            ListNode prev = head;
            ListNode curr = head.next;
            while (curr.next != null) {
                curr = curr.next;
                prev = prev.next;
            }
            curr.next = head;
            head = curr;
            prev.next = null;
        }
        return head;
    }
}