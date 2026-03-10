import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 0; i<s; i++) {
            Map<Integer, Integer> hashmap = new HashMap<>();
            int n = sc.nextInt();
            for (int j = 0;j<n;j++) {
                int key = sc.nextInt();
                int door = sc.nextInt();
                hashmap.put(door,key);

            }
            int closedDoor = sc.nextInt();
            if (hashmap.keySet().contains(closedDoor)) {
                System.out.println(hashmap.get(closedDoor));
            }
            else {
                System.out.println("Can't open the door.");
            }

        }
        sc.close();
    }
}