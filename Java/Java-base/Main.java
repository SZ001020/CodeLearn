import java.util.Scanner;

class LinkList {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data ;
            this.next = null ;
        }
    }
private Node headNode;
private int length;

    public LinkList() {
        headNode = null;
    }

    public Node insert(int data) {
        this.length++;
        Node newNode = new Node(data);

        if(headNode == null) {
            headNode = newNode;
            return headNode;
        }
        else {
            Node currentNode = headNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            return newNode;
        }
    }

    public void printLinkList() {
        Node currentNode = headNode;
        while (currentNode != null ) {
            System.out.printf("%d%c", currentNode.data,currentNode.next == null ? '\n' : ' ' );
            currentNode = currentNode.next;
        }
    }

    public Node get (int m ) {
        Node currentNode = headNode;
        if (m<1 || m>length) {
            return null; 
        }
        else {
            int i =1 ;
            while (currentNode != null) {
                if (i == m) {
                    return currentNode;
                }
                i++;
                currentNode = currentNode.next;
            }
            return null ;
        }
    }

    public Node add(int n,int data) {
        Node node = new Node(data);

        if (n == 1 ) {
            node.next = this.headNode;
            this.headNode = node;
            this.length++;
            return headNode;
        }
        else {
            Node preNode = get(n-1);
            if (preNode != null) {
                node.next = preNode.next;
                preNode.next = node;
                this.length++;
                return node;
            }
        }
        return null;
    }

    public Node delete(int n) {
        
        if (headNode == null) {
            return null;
        }
        else {
            if (n==1) {
                headNode = headNode.next;
                this.length--;
                return headNode;
                
            }
            else{
                Node preNode = get(n-1);
                if(preNode != null && preNode.next != null) {
                    
                    Node deleteNode = preNode.next;
                    preNode.next = preNode.next.next;
                    this.length--;
                    return deleteNode;
                }
            }
        }
        return null;
    }
} 

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkList linklist = new LinkList();
        while (sc.hasNextInt()) {
            int k = sc.nextInt();
            for (int i= 0;i<k;i++) {
                linklist.insert(sc.nextInt()) ;
            }

            int S = sc.nextInt();
            int n,x = 0;
            for(int j=0 ;j<S;j++) {
                n= sc.nextInt();
                x= sc.nextInt();
                LinkList.Node node =linklist.add(n,x);
                if(node != null) {
                    linklist.printLinkList();
                }
                else {
                    System.out.println("Insertion position is invalid.");
                }

            }

            int L = sc.nextInt();
            int m = 0;
            
            for (int h=0;h<L;h++) {
                m = sc.nextInt();
                LinkList.Node deleteNode =linklist.delete(m);
                if(deleteNode != null) {
                    linklist.printLinkList();
                }
                else {
                    System.out.println("Deletion position is invalid.");
                }
            }
        }
        sc.close();
    }
}