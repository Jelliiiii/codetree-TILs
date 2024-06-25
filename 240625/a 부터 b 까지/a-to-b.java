import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i=a; i<=b;){
            System.out.print(i + " ");
            if(i%2!=0){
                i = i*2;
            }else if(i%2==0){
                i = i+3;
            }
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}