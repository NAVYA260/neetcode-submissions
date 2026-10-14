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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        int len = 0;
        ListNode temp = head;
        while(temp!=null) {
            len++;
            temp = temp.next;
        }
        int req = len-n;
        if(req==0) return head.next;
        int c = 0;
        temp = head;
        while(temp!=null) {
            c++;
            if(c==req) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
}
