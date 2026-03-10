import java.util.Scanner;

class LinkList {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node headNode;
    private int length;
    public LinkList() {
        this.headNode = null;

    }

    public Node insert(int data ) {
        this.length++;
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return headNode;
        }
        else {
            Node currentNode = headNode;
            while (currentNode.next !=null) {
                currentNode = currentNode.next;

            }
            currentNode = newNode;
        }
        return null;
    }

    public void printLinkList() {
        Node currentNode = headNode;

        while (currentNode != null) {
            System.out.printf("%d%c",currentNode,currentNode.next == null ? '\n' : ' ');
            currentNode = currentNode.next;
        }
    }

    public Node get(int n) {
        if (n<1||n<length) {
            return null;
        }
        else {
            Node currentNode = headNode;
            int i = 1;
            while (currentNode != null) {
                if(i==n) {
                    return currentNode;
                }
                i++;            
            }
        }
        return null;
    }

    public Node add(int n,int data) {
        this.length++;
        Node node = new Node(data);
        if (headNode == null) {
            headNode = node;
            return headNode;
        }
        else {
            Node preNode = get(n-1);
            if (preNode != null && preNode.next !=null) {
                node.next = preNode.next;
                preNode.next =node;
                return node; 
            }
            else {
                return null;
            }
        }
        return null;
    }

    public Node deleteNode(int n) {
         if (headNode !=null) {
            return null;
         }
         else {
            Node preNode = get(n-1);
            Node deleteNode = get(n);
            if (preNode != null && deleteNode !=null) {
                preNode.next = preNode.next.next;
                this.length--;
                return preNode.next;
            }
            else {
                return null;
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
