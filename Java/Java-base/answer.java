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
    // 头节点
    private Node headNode;
    // 链表长度
    private int length;
 
    public LinkList() {
        this.headNode = null;
    }
    // 插入数据
    public Node insert(int data) {
        this.length++;
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return headNode;
        } else {
            Node currentNode = headNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            return newNode;
        }
    }
 
    // 输出整个链表
    public void printLinkList() {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.printf("%d%c",currentNode.data, currentNode.next == null ? '\n' : ' ');
            currentNode = currentNode.next;
        }
    }
 
    // 查找第 n 个元素
    public Node get(int n) {
        if (n < 1 && n > this.length) {
            return null;
        }
        int i = 1;
        Node currentNode = this.headNode;
        while (currentNode != null) {
            if (i == n) {
                return currentNode;
            }
            i++;
            currentNode = currentNode.next;
        }
        return null;
    }
 
    // 在第 n 个位置插入元素
    public Node insert(int n, int data) {
        Node node = new Node(data);
        if (n == 1) { // 头节点的情况
            node.next = this.headNode;
            this.headNode = node;
            this.length++;
            return node;
        } else {  // 不是头节点的情况
            Node preNode = get(n - 1);
            if (preNode != null) {
                node.next = preNode.next;
                preNode.next = node;
                this.length++;
                return node;
            }
        }
        return null;
    }
 
    // 删除第 n 个 元素
    public Node delete(int n) {
        if (this.headNode == null) { // 判断头节点是否还存在
            return null;
        }
        if (n == 1) {  // 如果是头节点
            Node deletedNode = this.headNode;
            this.headNode = this.headNode.next;
            this.length--;
            return deletedNode;
        } else {
            Node preNode = get(n - 1);
            if (preNode != null && preNode.next != null) {
                Node deletedNode = preNode.next;
                preNode.next = preNode.next.next;
                this.length--;
                return deletedNode;
            }
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int k = scanner.nextInt();
            LinkList linkList = new LinkList();
            for (int i = 0; i < k; i++) {
                linkList.insert(scanner.nextInt());
            }
          // 插入链表节点操作
            int s = scanner.nextInt();
            for (int i = 0; i < s; i++) {
                int n = scanner.nextInt();
                int x = scanner.nextInt();
                LinkList.Node node;
                if ((node = linkList.insert(n, x)) != null) {
                    linkList.printLinkList();
                } else {
                    System.out.println("Insertion position is invalid.");
                }
            }
          // 删除链表节点操作
            int l = scanner.nextInt();
            for (int j = 0; j < l; j++) {
                int m = scanner.nextInt();
                if (linkList.delete(m) != null) {
                    linkList.printLinkList();
                } else {
                    System.out.println("Deletion position is invalid.");
                }
            }
        }
        scanner.close();
    }
}