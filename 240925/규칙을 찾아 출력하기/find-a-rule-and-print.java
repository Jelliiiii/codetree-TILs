import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 첫 번째 줄과 마지막 줄은 n개의 별을 출력
        for (int i = 0; i < n; i++) {
            // 첫 번째 줄과 마지막 줄은 별을 모두 출력
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            } 
            // 중간 줄은 첫 번째와 마지막 별은 출력하고 중간은 공백 처리
            else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || j < n - i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // 중간 공백
                    }
                }
            }
            System.out.println(); // 줄 바꿈
        }
        sc.close();
    }
}