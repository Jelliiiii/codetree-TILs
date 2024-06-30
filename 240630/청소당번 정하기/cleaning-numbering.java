import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 0, b = 0, h = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                h++;
            } else if (i % 3 == 0) {
                b++;
            } else if (i % 2 == 0) {
                g++;
            }
        }

        System.out.print(g + " " + b + " " + h);
        sc.close();
    }
}