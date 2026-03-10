import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for ( int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            int len = s1.length();
            char[] chs = s1.toCharArray();
            for ( int j = 0; j < len-1; j+=2) 
            {
                swap(chs,j,j+1);
            }
            System.out.println(new String(chs));
    
        }
        sc.close();

    }

    private static void swap(char[] chs, int j ,int i) {
        char temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }
}