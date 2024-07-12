import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        int sum = 0;
        for(int i=1; i <=n; i++){
            num = sc.nextInt();
            sum += num;
        }
        double avg = (double)sum/n;
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}