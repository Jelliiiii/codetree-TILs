import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        for(int i=1;i<=10;i++){
            n = sc.nextInt();
            if(n%2!=0){
                count++;
            }       
        }
        System.out.println(count);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}