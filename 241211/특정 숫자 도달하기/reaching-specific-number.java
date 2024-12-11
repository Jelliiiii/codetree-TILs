import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean oo = false;

        for(int i=0; i<10; i++){
            int n = sc.nextInt();
            if(n>=250){
                oo = true;
                break;
            }
            sum += n;
            count++;
        }

        if(!oo){
            for(int i=0; i<10; i++){
                sum += sc.nextInt();
                count++;
            }
        }

        double avg = (double)sum/count;

        System.out.printf("%d %.1f\n", sum, avg);

        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}