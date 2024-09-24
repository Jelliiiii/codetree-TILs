import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < (n % 2 == 0 ? n : n - 1); i++) {
                if (i == 0) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("* ");
                    }
                } 
                else if (i % 2 == 0) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < (n - i / 2); j++) {
                        System.out.print("* ");
                    }
                }
                else {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < (n - i / 2); j++) {
                        if (j % 2 == 0) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println(); 
            }
        }
        sc.close();
    }
}