import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean oo = false;
        for(int i=a; i<=b; i++){
            if(1920%i==0||2880%i==0){
                oo = true;
                break;
            }else{
                oo = false;
            }
        }
        if(oo==true){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}