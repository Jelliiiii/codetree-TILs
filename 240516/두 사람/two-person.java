import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        String d = sc.next();
        if(b == "W" && d == "W"){
            System.out.print(0);
        }else if(a>=19 || c>=19){
            System.out.print(1);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}