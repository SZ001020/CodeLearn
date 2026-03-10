import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        while (sc.hasNextInt()) {
            Integer size =  sc.nextInt();
            if (size == 0 ) {break;}

            int sum = 0;
            int average = 0;

            for (int i  =0 ;i<size;i++) {
                nums.add(sc.nextInt());
                sum += nums.get(i);
            }

            average = sum / size;
            int num = 0;
            for (int i = 0; i < size; i++) {
                if(nums.get(i) > average) {
                    num += (nums.get(i) - average);

                }

            }
            System.out.println(num);
            System.out.println();
            nums.clear();
        }
        
    }
}