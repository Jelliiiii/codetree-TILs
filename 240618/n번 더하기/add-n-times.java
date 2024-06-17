import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), n = sc.nextInt();
        int res = a;
        for(int i=1; i<=n; i++){
            res += n;
            System.out.println(res);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}