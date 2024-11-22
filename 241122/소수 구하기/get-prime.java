import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) { // 1은 소수가 아니므로 2부터 시작
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            // 모든 약수를 확인한 후 cnt == 2인지 확인
            if (cnt == 2) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
