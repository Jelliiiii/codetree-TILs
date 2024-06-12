import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            if(i%3==0){
                System.out.print(i + " ");
            }
            i++;
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}