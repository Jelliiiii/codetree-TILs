import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
            if (i == 0 || i == n - 1) {
                // 첫 번째와 마지막 행에서는 마지막 별 뒤에 공백 없이 출력
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                    if (j < n - 1) {
                        System.out.print(" ");
                    }
                }
            } 
            // 중간 줄은 첫 번째와 마지막 별은 출력하고 중간은 공백 처리
            else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || j < n - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    // 각 별과 별 사이에만 공백을 추가
                    if (j < n - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}