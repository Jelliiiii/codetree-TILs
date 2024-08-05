import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        while(true){
            n = sc.nextInt();
            if(n%2==0){
                System.out.println(n/2);
                count++;
            }
            if(count==3){
                break;
            }
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}