import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = 1;
        for(int i=a; i<=b; i++){
            prod*=i;
        }
        System.out.print(prod);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}