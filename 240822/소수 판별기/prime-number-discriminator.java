import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean o = false;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            o = true;
        }else{
            o = false;
        }
        if(o==true){
            System.out.print("P");
        }else{
            System.out.print("C");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}