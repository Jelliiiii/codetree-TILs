import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int n = sc.nextInt();

            if (n < 20 || n > 29) {
                break;
            }

            sum += n;
            count++;
        }

        if (count > 0) {
            System.out.printf("%.2f", (double) sum / count);
        } else {
            System.out.println("No valid input for calculation");
        }

        sc.close();
    }
}