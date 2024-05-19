import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int m = Integer.MIN_VALUE;

        // a, b, c 중 최대값 찾기
        if (a > m) {
            m = a;
        }
        if (b > m) {
            m = b;
        }
        if (c > m) {
            m = c;
        }
        
        System.out.print(m);
        sc.close();
    }
}