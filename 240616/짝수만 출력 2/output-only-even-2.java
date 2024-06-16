import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), a = sc.nextInt();
        int i = b;
        while(i>=a){
            if(i%2==0){
                System.out.print(i + " ");
            }
            i--;
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}