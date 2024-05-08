import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=3000){
            System.out.print("book");
        }else if(n>=2000){
            System.out.print("mask");
        }else{
            System.out.print("no");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}