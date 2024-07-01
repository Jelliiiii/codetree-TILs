import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 0;
        for(int i=1; i<=n; i++){
            if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
                y++;
            }
        }
        System.out.print(y);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}