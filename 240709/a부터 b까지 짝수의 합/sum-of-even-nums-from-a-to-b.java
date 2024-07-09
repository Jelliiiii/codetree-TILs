import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int start = Math.min(a,b);
        int end = Math.max(a,b);
        for(int i = start; i<=end; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.print(sum);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}