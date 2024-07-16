import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro = a;
        for(int i=1;i<=b;i++){
            pro+=a*i;
        }
        System.out.print(pro);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}