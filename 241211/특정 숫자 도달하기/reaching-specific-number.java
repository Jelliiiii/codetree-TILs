import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n >= 250) {
                break; 
            }
            sum += n;
            count++;
        }

        while (count < 10) {
            int n = sc.nextInt();
            sum += n;
            count++;
        }

        double avg = (double) sum / count;
        System.out.printf("%d %.1f\n", sum, avg);

        sc.close();
    }
}
