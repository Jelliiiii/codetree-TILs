import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<5){
            System.out.printf((a*a) + "\n" + "tiny");
        }else{
            System.out.print((a*a));
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}