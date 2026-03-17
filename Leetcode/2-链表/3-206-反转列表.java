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
        return reserse (null,head);//初始条件
    }

    private ListNode reverse(ListNode prev, ListNode cur) {
        if (cur == null) { //终止条件
            return prev;
        }
        ListNode temp  = null;
        temp = cur.next;
        cur.next = prev;

        return reverse(cur,temp);//单层逻辑

    }
}

class solution3 {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}