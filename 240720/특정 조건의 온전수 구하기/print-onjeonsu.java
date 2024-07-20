import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(on(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();

        // 여기에 코드를 작성해주세요.
    }

    public static boolean on(int num){
        if(num%2==0){
            return  false;
        }
        if(num%10==5){
            return  false;
        }
        if(num%3==0 && num%9!=0){
            return  false;
        }

        return true;
    }
}