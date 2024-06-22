import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a>0){
            if(a>b){
                for(int i=1; i>=b; i--){
                    System.out.print(a);
                }
            }else if(a<b){
                for(int i=1; i<=b; i++){
                    System.out.print(a);
                }
            }
        }else{
            System.out.print(0);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}