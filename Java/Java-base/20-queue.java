import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner();
        int n =sc.nextInt();
        Quene<String> quene=new Quene(); 
        for (int i =0;i<n;i++) {
            quene.addLast(sc.next());
        }
        int m =sc.nextInt();
        for (int j=0; j<m;j++) {
            int opt =sc.nextInt();
            if (opt == 1) 
            {
                if (quene.isEmpty()) {
                    continue;
                }
                else {
                    quene.poll();
                }
            }
            else {
                quene.addLast(sc.next());
            }
        }
        if(quene.isEmpty()) {
            System.out.println("There are no more people in the queue.");

        }
        else {
            System.out.println(quene.poll());
        }

        sc.close();
    }
}