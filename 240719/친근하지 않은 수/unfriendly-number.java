import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0 && i%3!=0 && i%5!=0){
                count++;
                continue;
            }
        }
        System.out.print(count);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}