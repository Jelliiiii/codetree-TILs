import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            if(num[i]%2!=0 && num[i]%3==0){
                System.out.println(num[i]);
            }
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}