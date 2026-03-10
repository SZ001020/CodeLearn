import java.util.Scanner;

class LinkList { 
    public static class Node  {
        int data;
        Node next;

        public Node (int data) {
            this.data =data;
            this.next =null;

        }
    }
    
    private Node headNode;
    private int length;

    public LinkList() {
        this.headNode = null;

    }

    public Node insert(int data) {
        this.length++;
        Node newNode = new Node(data);

        if (this.headNode == null) {
            this.headNode = newNode;
            return this.headNode;

        }
        else{
            Node currentNode = this.headNode;
            while (currentNode.next != null ) {
                currentNode = currentNode.next;

            }
            currentNode.next = newNode;
            return newNode;
        }
    }

    public void printLinkList() {
        Node currentNode = this.headNode;
        while ( currentNode != null ) {
            System.out.printf("%d%c",currentNode.data,currentNode.next == null ? '\n' : ' ');
            currentNode= currentNode.next;
        }
    }

    public Node get(int m) {
        if ( m<1 ||m>length) {
            
            return null;
        }
        else{
            Node currentNode = this.headNode;
            int i = 1; 
            while (currentNode != null) {
                if ( i == m) {
                    return currentNode;
                }
                currentNode = currentNode.next;
                i++;
            }
            return null;
        }
    }




   
}

public class Main {
    public static void main (String[] args ) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            LinkList linkList = new LinkList();
            for (int i = 0 ;i<n ;i++) {
                linkList.insert(sc.nextInt());
            }
            for (int j = 0 ;j<m ; j++) {
                LinkList.Node node =  linkList.get(sc.nextInt());
                if (node != null) {
                    System.out.println(node.data);
                } 
                else{
                    System.out.println("Output position out of bounds.");
                }
                
            }
        }
        sc.close();
    }
}