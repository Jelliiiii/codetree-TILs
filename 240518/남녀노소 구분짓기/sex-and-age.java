import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a == 0){
            System.out.print(b>=19 ? "MAN" : "BOY");
        }else if(a == 1){
            System.out.print(b>=19 ? "WOMAN" : "GIRL");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}