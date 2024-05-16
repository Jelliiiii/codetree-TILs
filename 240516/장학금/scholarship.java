import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), f = sc.nextInt();
        int s = (m+f)/2;
        if(s<90){
            System.out.print(0);
        }else if(s>=90){
            System.out.print(50000);
        }else{
            System.out.print(100000);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}