import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            if(onn(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
    public static boolean onn(int num){
        if(num%2==0 && num%4!=0){
            return false;
        }

        if((num/8)%2==0){
            return false;
        }

        if((num%7)<4){
            return false;
        }

        return true;
    }
}