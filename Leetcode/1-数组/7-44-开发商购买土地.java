import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int [][] ver = new int[n][m];
        int sum = 0;

        int[] x = new int[n];
        int[] y = new int[m];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                ver[i][j] = sc.nextInt();
                sum += ver[i][j];
            }
        }
        
        for(int i= 0;i<n;i++) {
            for (int j =0; j<m;j++) {
                x[i] += ver[i][j];
            }
        }

        for(int j= 0;j<m;j++) {
            for (int i =0; i<n;i++) {
                y[j] += ver[i][j];
            }
        }

        int res = Integer.MAX_VALUE;
        int xCut = 0;
        for (int i = 0; i<n ; i++) {
            xCut += x[i];
            res = Math.min(res,Math.abs((sum - xCut)-xCut));

        }

        int yCut = 0;
        for (int j=0;j<m;j++) {
            yCut += y[j];
            res = Math.min(res,Math.abs((sum - yCut)-yCut));

        }
        System.out.println(res);
        sc.close();
    }
} 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
    }
}