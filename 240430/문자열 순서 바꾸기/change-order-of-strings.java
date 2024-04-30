import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next(), temp = "";
        temp = s;
        s = t;
        t = temp;
        System.out.println(s);
        System.out.println(t);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}