import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(true){
            if(n==1){
                System.out.print(count);
                break;
            }
            if(n%2==0){
                n = n/2;
                count++;
            }else if(n%2!=0){
                n = (n*3) + 1;
                count++;
            }
            
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}