import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if(a!=c){
            System.out.print(a>c ? "A" : "B");
        }else{
            System.out.print(b>d ? "A" : "B");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}