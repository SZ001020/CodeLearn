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
    public ListNode swapPairs(ListNode head) {
        ListNode virualhead = new ListNode(-1);

        virualhead.next = head;

        ListNode cur = virualhead;
        ListNode temp;
        ListNode firstnode;
        ListNode secondnode;

        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode;
            secondnode.next = firstnode;
            firstnode.next = temp;
            cur = firstnode;
            
        }
        return virualhead.next;
    }
}
