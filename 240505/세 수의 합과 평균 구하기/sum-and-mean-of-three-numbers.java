import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int sum = a + b + c;
        int avg = (a+b+c)/3;
        System.out.print(sum + "\n" + avg);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}