import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 전체 n개의 줄을 처리
        for (int i = 0; i < n; i++) {
            
            // 첫 번째 줄과 마지막 줄
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                    if (j < n - 1) {
                        System.out.print(" ");
                    }
                }
            } 
            // 중간 줄들 (첫 번째와 마지막 별 사이에 공백 처리)
            else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || j < n - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    if (j < n - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); // 줄 바꿈
        }
        sc.close();
    }
}