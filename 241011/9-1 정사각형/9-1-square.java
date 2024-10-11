import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oo = 9;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(oo);
                oo-=1;
                if(oo<1){
                    oo=9;
                }
            }
            System.out.println();
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}