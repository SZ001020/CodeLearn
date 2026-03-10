import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(sc.hasNextInt()) {
            for(int i = 0; i<n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+b); 
            }
        }
        sc.close();
    }
}

//解法2
