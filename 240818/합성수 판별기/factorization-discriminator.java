import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean bo = false;
        for(int i=2; i<=(n-1); i++){
            if(n%i==0){
                bo = true;
                break;
            }else{
                bo = false;
            }
        }
        if(bo==true){
            System.out.print("C");
        }else{
            System.out.print("N");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}