import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<n;i++) {
            stack.push(sc.nextInt());

        }
        int m = sc.nextInt();
        for(int j =0; j<m;j++) {
            int l = sc.nextInt();

            if(l == 1) {
                
                if(!stack.isEmpty()){
                    
                    stack.pop();
                }
            }
            else {
                stack.push(sc.nextInt());
            }
           
        }
        if (stack.isEmpty()) {
                System.out.println("All the dishes have been washed.");
            }
        else{
            System.out.println(stack.peek());
        }
        sc.close();
    }
}