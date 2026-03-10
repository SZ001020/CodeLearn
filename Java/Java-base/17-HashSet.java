import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i=0; i<k; i++) {
            Set<Integer> set = new HashSet();
            int m = sc.nextInt();
            for(int j=0; j<m; j++) {
                set.add(sc.nextInt());
            }

            int n = sc.nextInt();

            if(set.contains(n)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        sc.close();

    }
    
}
