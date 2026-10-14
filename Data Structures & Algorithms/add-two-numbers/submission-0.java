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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int c = 0, sum = 0;
        while(l1!=null || l2!=null) {
            sum = 0;
            if(l1!=null) {
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                sum+=l2.val;
                l2 = l2.next;
            }
            sum+=c;
            temp.next = new ListNode(sum%10);
            c = sum/10;
            temp = temp.next;
        }
        if(c!=0) {
            temp.next = new ListNode(c);
        }
        return dummy.next;
    }
}
