import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;          // 합계 변수
        int count = 0;        // 개수 변수
        boolean limitReached = false; // 250 이상이 발견되었는지 여부

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            // 250 이상의 정수를 만나면 반복 종료
            if (num >= 250) {
                limitReached = true;
                break;
            }

            // 합계와 개수 계산
            sum += num;
            count++;
        }

        // 만약 250 이상의 숫자가 없으면 나머지 숫자를 포함
        if (!limitReached) {
            for (int i = count; i < 10; i++) {
                sum += sc.nextInt();
                count++;
            }
        }

        // 평균 계산 (소수 첫째 자리까지 출력)
        double avg = (double) sum / count;

        // 결과 출력
        System.out.printf("%d %.1f\n", sum, avg);
        sc.close();
    }
}
