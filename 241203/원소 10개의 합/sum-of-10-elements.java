import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<10; i++){
            int n = sc.nextInt();
            sum += n;
        }
        System.out.print(sum);
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}