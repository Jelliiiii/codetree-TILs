import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 첫 번째 줄과 마지막 줄은 항상 별로 가득 채움
        for (int i = 0; i < n; i++) {
            // 첫 번째 줄과 마지막 줄
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                    if (j < n - 1) {
                        System.out.print("  ");
                    }
                }
            } 
            // 중간 줄 처리
            else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1) {
                        System.out.print("* ");
                    } 
                    // 중간의 공백 처리
                    else if (j < i) {
                        System.out.print("  ");
                    } 
                    // 별 출력
                    else if (j >= i) {
                        System.out.print("* ");
                    }

                    if (j < n - 1) {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}