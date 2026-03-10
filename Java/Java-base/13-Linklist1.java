import java.util.Scanner;

class LinkList {
    
    public static class Node {
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

        this.headNode =null;

    }
    public Node insert(int data) {
        this.length++;
        Node newNode = new Node(data);
        if (this.headNode == null) {
            this.headNode = newNode;
            return this.headNode;
        
        }
        else {
            Node currentNode = this.headNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;

            }
            currentNode.next =newNode;
            return newNode;

        }
        
    }
    
    public void printLinkList() {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.printf("%d%c", currentNode.data,currentNode.next == null ? '\n' : ' ');
            currentNode = currentNode.next;

        }

    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = sc.nextInt();
            LinkList linkList = new LinkList();
            for (int i = 0; i<n ;i++) {
                LinkList.insert(scanner.nextInt());

            }
            linkList.printLinkList();
        }
        scanner.close();            
    }
}