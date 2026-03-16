class MyLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    private int size;
    private ListNode head;

    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode(0);            
    }

    
    public int get(int index) {
        if( 0 > index || index >= size) {
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i<=index;i++) {
            cur = cur.next;
        }
        return cur.val;

    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;
        
    }
    
    public void addAtTail(int val) {
        ListNode cur = head;
        ListNode newNode = new ListNode(val);
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index >size) {
            return;
        }
        ListNode pre = head;
        ListNode newNode = new ListNode(val);

        for(int i =0; i<index ;i++) {
            pre = pre.next;
        }
        newNode.next = pre.next;
        pre.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >=size) {
            return;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }
}

class MyLinkedList2 {
    
    class ListNode {
        int val;
        ListNode prev,next;
        ListNode(int val) {
            this.val = val;
        }
    }
    private int size;
    private ListNode head,tail;

    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode(0);
        this.tail = new ListNode(0);

        this.head.next = tail;
        this.tail.prev = head;        
        
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = head;
        if (index > size/2) {
            cur = tail;
            for (int i = 0;i<size - index;i++) {
                cur = cur.prev;
            }
        }
        else {
            for (int i = 0; i<=index ; i++) {
                cur = cur.next;
            }
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) {
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode pre = head;
        for(int i = 0; i<index;i++) {
            pre = pre.next;
        }

        newNode.next = pre.next;
        pre.next.prev = newNode;
        pre.next = newNode;
        newNode.prev = pre;
        size++;

    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }
        ListNode pre = head;
        for(int i = 0;i<index; i++) {
            pre = pre.next;
        }
        pre.next.next.prev = pre;
        pre.next = pre.next.next;


        size--;
    }
}
