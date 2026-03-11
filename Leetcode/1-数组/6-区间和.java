import java.util.Scanner;

public class Main {
    public class void static main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] sum = new int[n];
        int presum = 0;

        for (int i = 0;i < n ;i++) {
            nums[i] = sc.nextInt();
            presum += sum[i];
            sum[i] = presum;
        }

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a==0 ? sum[b] : sum[b] - sum[a-1]);
        }
        sc.close();
    }
}