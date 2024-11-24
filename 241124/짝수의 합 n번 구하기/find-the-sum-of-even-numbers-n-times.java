import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int x = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j<=b; j++){
                if(j%2==0){
                    x+=j;
                }
            }
            System.out.println(x);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}