import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int[] box = new int[10];

        for(int i = 0; i<10; i++){
            int n = sc.nextInt();     
                if(n==0){
                    break;
                }
            box[i] = n;
            sum += n;
            count++;
        }

        double avg = (double)sum/count;

        System.out.printf("%d %.1f\n", sum, avg);


        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}