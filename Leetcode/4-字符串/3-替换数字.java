import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        String res = new String();
        while(sc.hasNext()) {
            s = sc.next();
            for(int i = 0;i<s.length();i++) {

                if(s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                    res += "number";
                }
                else {
                    res +=s.charAt(i);
                }
            }
        }
        System.out.print(res);
    }
}

