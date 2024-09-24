import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 첫 번째 줄: n개의 별 출력
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(); // 첫 번째 줄 출력 완료 후 줄 바꿈

        // 두 번째 줄부터 n개의 줄을 출력
        for (int i = 1; i < n; i++) {
            // 앞에 공백 추가
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 짝수 줄에서는 별 사이에 공백 없이 출력
            if (i % 2 == 0) {
                for (int j = 0; j < (n - i / 2); j++) {
                    System.out.print("* ");
                }
            }
            // 홀수 줄에서는 별 사이에 공백을 추가하여 출력
            else {
                for (int j = 0; j < (n - i / 2); j++) {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // 별 사이에 공백 추가
                    }
                }
            }
            System.out.println(); // 한 줄 출력 후 줄 바꿈
        }
        sc.close();
    }
}