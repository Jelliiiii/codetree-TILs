import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oo = 2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((oo) + " ");
                oo+=2;
                if(oo>=10){
                    oo = 2;
                }
            }
            System.out.println();
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}