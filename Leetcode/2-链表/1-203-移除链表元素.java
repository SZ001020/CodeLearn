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
    public ListNode removeElements(ListNode head, int val) {
        while (head!= null && head.val == val) {
            head = head.next;
        }
        ListNode curr = head;
        while(curr != null && curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;

            }
            else {
                curr = curr.next;
            }

            return head;
        }
    }
}

class Solution1 {
    public ListNode removeElements(ListNode head,int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val ) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return head;

    }
}

class Solution2 {
    public ListNode removeElements(ListNode head,int val) {
        while (head != null && head.next != null) {
            head = head.next;
        }

        if (head == null) {
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;

        while (cur != null) {
            if(cur.val == val) {
                pre.next = pre.next.next;
            }
            else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}