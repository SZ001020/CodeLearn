import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNextLine()) {
            
        
            String inputline = sc.nextLine();

            String[] parts = inputline.split(" ");

            int sum = 0 ;
            int count = 0;

            boolean isValid = true;

            for (String part  : parts ) {
                if (part.equals("A")) {
                    sum += 4;
                    count++;
                }
                else if (part.equals("B")) {
                    sum += 3;
                    count++;
                }
                else if (part.equals("C")) {
                    sum += 2;
                    count++;
                }
                else if (part.equals("D")) {
                    sum += 1;
                    count++;
                }
                else if (part.equals("F")) {
                    count++;
                }
                else {
                    isValid = false;
                    System.out.println("Unknown");
                    break;
                }
            }

            if (isValid) {
                System.out.printf("%.2f\n", (double)sum/count);
            }

            
        }
        
    }
}