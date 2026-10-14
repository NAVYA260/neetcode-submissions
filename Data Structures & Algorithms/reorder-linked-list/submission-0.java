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
    private ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
            ListNode nn = reverse(head.next);
            head.next.next = head;
            head.next = null;
        return nn;
    }
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode rev = reverse(mid.next);
        mid.next = null;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(head!=null && rev!=null) {
            temp.next = head;
            head = head.next;
            temp = temp.next;
            temp.next = rev;
            rev = rev.next;
            temp = temp.next;
        }
        if(head!=null) temp.next = head;
        if(rev!=null) temp.next = rev;
        
    }
}
