import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();
        String c = sc.next();
        int d = sc.nextInt();
        String e = sc.next();
        int f = sc.nextInt();

        int A = 0, B = 0, C = 0, D = 0;

        if (a.equals("Y") && b >= 37) {
            A++;
        } else if (a.equals("N") && b >= 37) {
            B++;
        } else if (a.equals("Y") && b < 37) {
            C++;
        } else if (a.equals("N") && b < 37) {
            D++;
        }

        if (c.equals("Y") && d >= 37) {
            A++;
        } else if (c.equals("N") && d >= 37) {
            B++;
        } else if (c.equals("Y") && d < 37) {
            C++;
        } else if (c.equals("N") && d < 37) {
            D++;
        }

        if (e.equals("Y") && f >= 37) {
            A++;
        } else if (e.equals("N") && f >= 37) {
            B++;
        } else if (e.equals("Y") && f < 37) {
            C++;
        } else if (e.equals("N") && f < 37) {
            D++;
        }

        if (A >= 2) {
            System.out.print("E");
        } else {
            System.out.print("N");
        }

        sc.close();
    }
}