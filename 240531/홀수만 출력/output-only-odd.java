import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i=a; i<=b; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}