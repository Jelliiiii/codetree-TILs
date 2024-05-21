import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if((a>b && a<c)||(a<b && a>c)){
            System.out.print(a);
        }
        if((b>c && b<a)||(b>a && b<c)){
            System.out.print(b);
        }
        if((c>a && c<b)||(c>b && c<a)){
            System.out.print(c);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}