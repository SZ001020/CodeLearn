class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode temp = null;
        ListNode cur = head;
        while(cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}

class solution2 {
    public ListNode reverseList(ListNode head) {
        return reserse (null,head);
    }

    private ListNode reverse(ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }
        ListNode 
    }
}