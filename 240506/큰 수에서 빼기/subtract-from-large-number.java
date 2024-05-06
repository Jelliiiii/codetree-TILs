import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a<b){
            System.out.print(b-a);
        }else{
            System.out.print(a-b);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}