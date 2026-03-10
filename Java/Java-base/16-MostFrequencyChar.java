import java.util.Scanner; 


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i<n ; i++) {
            String input = sc.next();
            char M = findMostFrequentChar(input);
            System.out.println(M);
        }

        sc.close();
    }

    public static char findMostFrequentChar(String input) {
        int[] frequency = new int[26];
        for (char c : intput.toCharArray()) {
            frequency[c - 'a']++;
        }
        char mostFrequencyChar = 'a';

        int maxFrequency = frequency[0];
        for (int i = 1;i<26;i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequencyChar = (char)('a' + i);

            }
        }
        return mostFrequencyChar;
    }
    
}
