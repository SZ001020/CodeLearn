import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String ch = sc.next();
        char[] s = ch.toCharArray();
        reverse(s,0,s.length - 1);
        reverse(s,0,k-1);
        reverse(s,k,s.length - 1);
        System.out.println(s);
    }

    private static void reverse(char[] s, int l,int r) {
        while (l < r) {
            s[l] ^= s[r];
            s[r] ^= s[l];
            s[l] ^= s[r];
            r--;
            l++;
        }
    }
}