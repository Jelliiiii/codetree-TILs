import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 0;

        while (N > 1) {
            N /= 2;
            x++;
        }

        System.out.println(x);
        // 여기에 코드를 작성해주세요.
    }
}