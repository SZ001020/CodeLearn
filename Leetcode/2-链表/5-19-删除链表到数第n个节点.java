class Solution {
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