import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
            int n = sc.nextInt();
            

            while (n-- > 0) {
                while (sc.hasNextInt()){
                    int num =sc.nextInt();
                    nums.add(num);
                }
            }

            for (int i= nums.size()-1;i>=0;i--) {
                System.out.print(nums.get(i));
                if(i>0){
                    System.out.print(" ");
                }
            }
            System.out.println();

            for (int i = 0;i<nums.size();i+=2) {
                System.out.print(nums.get(i));
                if(i<nums.size()) {
                    System.out.print(" ");
                }
            }

        
        sc.close();
    }
}

//不使用ArrayList的写法
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums = new int [n];
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        for (int i=nums.length-1;i>=0;i--){
            System.out.println(nums[i]);
            if(i>0) System.out.println(" ");
        }
        sc.close();
    }
}