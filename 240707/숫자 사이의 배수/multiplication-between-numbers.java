import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), sum = 0;
        double avg = 0, count = 0;
        for(int i=a; i<=b; i++){
            if(i%5==0 || i%7==0){
                sum += i;
                count++;
            }
        }
        avg = sum/count;
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}