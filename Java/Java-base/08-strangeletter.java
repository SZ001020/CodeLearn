import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int nums = sc.nextInt();
            int sum = 0;
            while (nums > 0){
                int num = nums % 10;
                if (num % 2 == 0) {
                    sum += num;
                }
                nums = nums /= 10;
            }
            System.out.println(sum);
            System.out.println();

        }
    }
}