import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = new char[10];
        for(int i=0; i<10; i++){
            chars[i] = sc.next().charAt(0);
        }
        for(int i=9; i>=0; i--){
            System.out.print(chars[i]);
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}