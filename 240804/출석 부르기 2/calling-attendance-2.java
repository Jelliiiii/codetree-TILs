import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            n = sc.nextInt();
            if(n==1){
                System.out.println("John");
            }
            if(n==2){
                System.out.println("Tom");
            }
            if(n==3){
                System.out.println("Paul");
            }
            if(n==4){
                System.out.println("Sam");
            }
            if(n<1 || n>4){
                System.out.println("Vacancy");
                break;
            }
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}