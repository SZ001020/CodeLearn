public class Solution {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;

        int lenA = 0;
        int lenB = 0;

        while (curA != null) {
            curA = curA.next;
            lenA++;
        }        
        while (curB != null) {
            curB = curB.next;
            lenB++;
        }
        curA = headA;
        curB = headB;
        if (lenB>lenA) {
            int tmpLen = lenA;
            lenA = lenB;
            lenB = tmpLen;

            ListNode tmpNode = curA;
            curA = curB;
            curB = tmpNode;
        }

        int gap = lenA - lenB;
        while (gap-- >0) {
            curA = curA.next;

        }
        while (curA != null) {
            if(curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;

    }
}

public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
        ListNode p1 = headA,p2 = headB;
        while (p1 != p2) {
            if(p1 == null) {
                p1 = headB; 
            }
            else {
                p1 = p1.next;
            }

            if(p2 == null) {
                p2 = headA;
            }
            else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}