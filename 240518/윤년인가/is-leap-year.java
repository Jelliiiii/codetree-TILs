import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y%4!=0 || (y%100==0 && y%400!=0)){
            System.out.print("false");
        }else{
            System.out.print("true");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}