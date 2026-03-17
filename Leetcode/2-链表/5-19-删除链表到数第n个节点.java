
lass Solution {//自己写的暴力解法
    class ListNode removeNthFromEnd(ListNode head,int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            cur = cur.next;
            size++;
        }

        ListNode pre = dummy;

        for(int i = 0 ; i < size - n;i++ ) {
            
            pre = pre.next;

        }
        pre.next = pre.next.next;
        return dummy.next;
    }
}

class Solution2 {
    class ListNode removeNthFromEnd(ListNode head,int n) {
        ListNode dummy = new ListNode(0,head);

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i<=n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if(slow.next != null) {
            slow.next = slow.next.next;
        }

        return dummy.next;
    }
}