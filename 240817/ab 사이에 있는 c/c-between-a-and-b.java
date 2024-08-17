import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean st = false;
        for(int i=a; i<=b; i++){
            if(i%c==0){
                st = true;
            }
        }
        if(st==true){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}