import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    final private Node<E> head,tail;

    private int size;

    private static class Node<E> {
        E val;
        Node<E> next;
        Node<E> prev;

        Node(E val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = new Node<>(null);
        this.tail = new Node<>(null);
        //初始的head和tail实际上都是虚拟节点
        head.next = tail;
        tail.prev = head;
        this.size = 0; 
    }

    public void addLast(E e) {
        Node<E> x = new Node<>(e);
        Node<E> temp = tail.prev;

        temp.next = x;
        x.prev = temp;

        x.next = tail;
        tail.prev = x;

        size++;
    }

    public void addFirst(E e) {
        Node<E> x = new Node<>(e);
        Node<E> temp = head.next;

        head.next = x;
        x.prev = head;

        x.next = temp;
        temp.prev = x;

        size++;
    }

    public void add(int index,E element) {
        
        if(index == size) {
            addLast(element);
            return;
        }
        Node<E> p = getNode(index);
        Node<E> temp = p.prev;
        Node<E> x = new Node<>(element);

        temp.next = x;
        x.prev = temp;

        x.next = p;
        p.prev = x;

        size++;

    }

    public E removeFirst() {
        if(size < 1) {
            throw new NoSuchElementException();
        } 
        Node<E> x = head.next;
        Node<E> temp = x.next;

        head.next = temp;
        temp.prev = head;

        E val = x.val;
        x.prev = null;
        x.next = null;

        size--;
        return val;
    }

    public E removeLast() {
        if(size < 1) {
            throw new NoSuchElementException();
        }

        Node<E> x = tail.prev;
        Node<E> temp = x.prev;

        temp.next = tail;
        tail.prev = temp;

        E val =x.val;

        x.prev = null;
        x.next = null;

        size--;
        return val;
    }

    public E remove(int index) {
        checkElementIndex(index);

        Node<E> x = getNode(index);
        Node<E> prev = x.prev;
        Node<E> next = x.next;

        prev.next = next;
        next.prev = prev;

        E val = x.val;
        x.prev = null;
        x.next = null;

        size--;
        return val;
    }

    public E get(int index) {
        checkElementIndex(index);
        Node<E> p = getNode(intdex);

        return p.val;
    }

    public E getFirst() {
        if(size < 1) throw new NoSuchElementException();
        return head.next.val;
    }

    public E getLast() {
        if(size < 1) throw new NoSuchElementException();
        return tail.prev.val;
    }

    public E set(int index, E val) {
        checkElementIndex(index);

        Node<E> x = getNode(index);
        E oldVal = x.val;
        x.val = val;

        return oldVal;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node<E> getNode(int index) {
        checkElementIndex(index);
        Node<E> p = head.next;
        for(int i = 0;i < index;i++) {
            p = p.next;
        }
        return p;
    }



}