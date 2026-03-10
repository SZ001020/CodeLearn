import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i=0;i<n;i++) {
                int m =sc.nextInt();
                int sum = 0;
                for (int j=0;j<m;j++) {
                    sum += sc.nextInt();
                }
                System.out.println(sum);
                if (i<n-1) System.out.println();
            }

        }
    }
}