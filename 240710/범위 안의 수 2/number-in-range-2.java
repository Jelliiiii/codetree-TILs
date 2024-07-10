import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count=0;
        for(int i=1;i<=10;i++){
            int n = sc.nextInt();
            if(n>0 && n<=200){
                sum+=n;
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}