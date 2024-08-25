import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i=1; i<=5; i++){
            int n = sc.nextInt();
            if(n%3==0){
                count++;
            }
        }
        if(count==5){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}