import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.print("John");
        } else if(a==2){
            System.out.print("Tom");
        } else if(a==3){
            System.out.print("Paul");
        }else{
            System.out.print("Vacancy");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}