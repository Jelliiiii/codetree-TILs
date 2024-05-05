import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = a+b;
        double avg = (double)(a+b)/2;
        System.out.printf("%d %.1f", sum, avg);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}