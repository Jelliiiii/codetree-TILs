import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n;
        for(int i=1;i<=5;i++){
            n = sc.nextInt();
            if(n%2==0){
                count++;
            }
        }
        System.out.print(count);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}