import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}