import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s>=80){
            System.out.print("pass");
        }else{
            System.out.print((80-s) + "more score");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}